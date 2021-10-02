package com.geekbrains.weathapp.ui.main.model

class DetailsRepositoryImpl(private val remoteDataSource: RemoteDataSource) :
    DetailsRepository {

    override fun getWeatherDetailsFromServer(
        lat: Double,
        lon: Double,
        callback: Any
    ) {       remoteDataSource.getWeatherDetails(lat, lon, callback)
    }
}