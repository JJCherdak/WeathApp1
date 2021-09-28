package com.geekbrains.weathapp.ui.main.viewmodel

import com.geekbrains.weathapp.ui.main.model.Weather

sealed class AppState {
    data class Success(val weatherData: List<Weather>) : AppState()
    data class Error(val error: Throwable) : AppState()
    object Loading : AppState()
}