package com.geekbrains.weathapp.ui.main.model

interface DetailsRepository {
    fun getWeatherDetailsFromServer(
        lat: Double,
        lon: Double,
        callback: Any
    )
}