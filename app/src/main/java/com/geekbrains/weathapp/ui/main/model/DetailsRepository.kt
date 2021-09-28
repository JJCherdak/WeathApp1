package com.geekbrains.weathapp.ui.main.model

import javax.security.auth.callback.Callback

interface DetailsRepository {
    fun getWeatherDetailsFromServer(
        lat: Double,
        lon: Double,
        callback: retrofit2.Callback<WeatherDTO>
    )
}