package com.geekbrains.weathapp.ui.main

    interface Repository {
        fun getWeatherFromServer(): Weather
        fun getWeatherFromLocalStorage(): Weather
    }
