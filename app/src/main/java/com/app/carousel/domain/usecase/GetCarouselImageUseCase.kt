package com.app.carousel.domain.usecase

import com.app.carousel.data.model.Carousel
import com.app.carousel.domain.respository.CarouselRepository
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetCarouselImageUseCase @Inject constructor(private val carouselRepository: CarouselRepository) {
    suspend fun getCarouselImage():Flow<List<Carousel>> {
        return carouselRepository.getCarouselImage()
    }
}