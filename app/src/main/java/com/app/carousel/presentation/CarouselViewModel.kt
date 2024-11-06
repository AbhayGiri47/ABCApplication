package com.app.carousel.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.app.carousel.data.model.Carousel
import com.app.carousel.data.model.CarouselList
import com.app.carousel.domain.CoroutinesDispatcherProvider
import com.app.carousel.domain.model.CarouselAnalysis
import com.app.carousel.domain.model.CarouselAnalysisRequest
import com.app.carousel.domain.model.CarouselBaseUseCase
import com.app.carousel.domain.model.CarouselListRequest
import com.app.carousel.domain.model.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CarouselViewModel @Inject constructor(
    private val dispatcher: CoroutinesDispatcherProvider,
    private val carouselBaseUseCase: CarouselBaseUseCase
) : ViewModel() {

    private val _searchQuery = MutableStateFlow("")
    val searchQuery get() = _searchQuery.asStateFlow()

    private val _carouselImage = MutableStateFlow<List<Carousel>>(emptyList())
    val carouselImage get() = _carouselImage.asStateFlow()

    private val _carouselList = MutableStateFlow<List<CarouselList>?>(null)
    val carouselList get() = _carouselList.asStateFlow()

    private val _carouselAnalysis =
        MutableStateFlow<Resource<CarouselAnalysis>>(Resource.loading())
    val carouselAnalysis get() = _carouselAnalysis.asStateFlow()

    private val _showBottomSheet = MutableSharedFlow<Boolean>()
    val showBottomSheet get() = _showBottomSheet.asSharedFlow()


    private var currentCarouselForDisplay = -1

    fun onCarouselChanged(index: Int) {
        currentCarouselForDisplay = index
        _searchQuery.value = ""
        getCarouselList()
    }

    fun onSearchValueChange(query: String) {
        _searchQuery.value = query
        onSearchTriggered()
    }

    private fun onSearchTriggered() {
        getCarouselList()
    }

    private fun getCarouselImage() = viewModelScope.launch(dispatcher.io) {
        carouselBaseUseCase.getCarouselImageUseCase.getCarouselImage().collect {
            _carouselImage.emit(it)
        }
    }

    private fun getCarouselList() = viewModelScope.launch(dispatcher.io) {
        if (currentCarouselForDisplay < 0 || carouselImage.value.isEmpty()) {
            return@launch
        }
        val catalogType = carouselImage.value[currentCarouselForDisplay].type
        carouselBaseUseCase.getCarouselListUseCase.getCarouselList(
            CarouselListRequest(
                catalogType,
                searchQuery.value
            )
        ).collect {
            _carouselList.emit(it)
        }
    }

    fun showBottomSheet() = viewModelScope.launch(dispatcher.io) {
        _showBottomSheet.emit(true)
        startCarouselAnalysis()
    }

    private fun startCarouselAnalysis() = viewModelScope.launch(dispatcher.computation) {
        _carouselAnalysis.emit(Resource.loading())
        carouselBaseUseCase.getCarouselAnalysisUseCase.getCarouselAnalysisData(
            CarouselAnalysisRequest(
                carouselList.value,
                catalogType = carouselImage.value[currentCarouselForDisplay].type
            )
        ).catch {
            _carouselAnalysis.emit(Resource.error(it))
        }.collect {
            _carouselAnalysis.emit(Resource.success(it))
        }
    }

    init {
        getCarouselImage()
    }

}