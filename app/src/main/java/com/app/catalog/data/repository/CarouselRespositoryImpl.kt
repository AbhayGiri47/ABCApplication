package com.app.catalog.data.repository

import com.app.catalog.data.db.DataStore
import com.app.catalog.data.entity.CatalogType
import com.app.catalog.domain.respository.CatalogRepository
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class CatalogRepositoryImpl @Inject constructor(private val dataStore: DataStore) :
    CatalogRepository {

    override suspend fun getCatalogList() = flow {
        emit(dataStore.catalogList)
    }

    override suspend fun getCatalogRange(catalogType: CatalogType) = flow {
        val response = when (catalogType) {
            CatalogType.CITY -> dataStore.citySubItems
            CatalogType.DOG -> dataStore.dogSubItems
            CatalogType.FLOWER -> dataStore.flowerSubItems
            CatalogType.CAR -> dataStore.carSubItems
            CatalogType.BIKE -> dataStore.bikeSubItems
        }
        emit(response)
    }

}