package com.app.catalog.domain.model

import com.app.catalog.data.entity.CatalogType

data class CatalogAnalysis(
    val itemCount: Int,
    val characterOccurrences: Map<Char, Int>,
    val catalogType: String
)