package com.geekbrains.weathapp.ui.main.model

    interface Repository {
        fun getWeatherFromServer(): Weather
        fun getWeatherFromLocalStorage(): Weather
    }
