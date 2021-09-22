package com.geekbrains.weathapp.ui.main.model

    interface Repository {
        fun getWeatherFromServer(): Weather
        fun getWeatherFromLocalStorageRus(): List<Weather>
        fun getWeatherFromLocalStorageWorld(): List<Weather>
    }
