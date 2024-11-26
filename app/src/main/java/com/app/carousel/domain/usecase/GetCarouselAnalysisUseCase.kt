package com.app.carousel.domain.usecase

import com.app.carousel.domain.model.CarouselAnalysis
import com.app.carousel.domain.model.CarouselAnalysisRequest
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class GetCarouselAnalysisUseCase() {

    fun getCarouselAnalysisData(params: CarouselAnalysisRequest): Flow<CarouselAnalysis> = flow {
        requireNotNull(params.carouselList) { "Item list cannot be empty" }
        require(params.carouselList.isNotEmpty()) { "Item list cannot be empty" }

        val occurrence = hashMapOf<Char, Int>()
        for (item in params.carouselList) {
            for (data in item.title) {
                if (data == ' ') continue
                occurrence[data] = (occurrence[data] ?: 0) + 1
            }
        }
        val sortedMap =
            occurrence.toList().sortedByDescending { (_, value) -> value }
                .take(params.analysisOutputCount).toMap()
        emit(
            CarouselAnalysis(
                itemCount = params.carouselList.size,
                characterOccurrences = sortedMap,
                carouselType = params.catalogType.toString().lowercase()
                    .replaceFirstChar { it.uppercaseChar() }
            )
        )
    }
}