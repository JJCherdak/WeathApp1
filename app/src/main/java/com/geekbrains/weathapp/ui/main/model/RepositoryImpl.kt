package com.geekbrains.weathapp.ui.main.model

import com.geekbrains.weathapp.ui.main.model.Repository

class RepositoryImpl : Repository {

    override fun getWeatherFromServer() = Weather()

    override fun getWeatherFromLocalStorageRus() = getRussianCities()

    override fun getWeatherFromLocalStorageWorld() = getWorldCities()
}