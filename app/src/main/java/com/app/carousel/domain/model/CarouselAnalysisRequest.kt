package com.app.carousel.domain.model

import com.app.carousel.data.model.CarouselList
import com.app.carousel.data.model.CarouselType

data class CarouselAnalysisRequest(
    val carouselList: List<CarouselList>?,
    val analysisOutputCount: Int = 3,
    val catalogType: CarouselType
)
