package com.geekbrains.weathapp.ui.main.model

import com.geekbrains.weathapp.BuildConfig
import com.google.gson.GsonBuilder
import okhttp3.Callback
import okhttp3.OkHttpClient
import okhttp3.Request
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

private const val REQUEST_API_KEY = "X-Yandex-API-Key"

class RemoteDataSource {

    private val weatherApi = Retrofit.Builder()
        .baseUrl("https://api.weather.yandex.ru/")
        .addConverterFactory(
            GsonConverterFactory.create(
                GsonBuilder().setLenient().create()
            )
        )
        .build().create(WeatherAPI::class.java)

    fun getWeatherDetails(lat: Double, lon: Double, callback: Callback<WeatherDTO>) {
        weatherApi.getWeather("04a63f5d-0a78-4669-b35b-346563186bed", lat, lon).enqueue(callback)
    }
}