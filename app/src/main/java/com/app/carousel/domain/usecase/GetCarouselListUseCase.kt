package com.app.carousel.domain.usecase

import com.app.carousel.data.model.CarouselList
import com.app.carousel.data.model.CarouselType
import com.app.carousel.domain.model.CarouselListRequest
import com.app.carousel.domain.respository.CarouselRepository
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class GetCarouselListUseCase @Inject constructor(private val carouselRepository: CarouselRepository) {

    suspend fun getCarouselList(carouselListParam: CarouselListRequest): Flow<List<CarouselList>> {
        return carouselRepository.getCarouselList(carouselListParam.carouselType)
            .map { responseList ->
                responseList.filter { item ->
                    item.title.contains(carouselListParam.searchQuery, ignoreCase = true)
                }
            }
    }
}