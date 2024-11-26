package com.app.carousel.domain.model

import com.app.carousel.data.model.CarouselType

data class CarouselListRequest(val carouselType: CarouselType, val searchQuery: String)
