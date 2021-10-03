package com.geekbrains.weathapp.ui.main.model

class RepositoryImpl : Repository {

    override fun getWeatherFromServer() = Weather(icon = fact.icon)

    override fun getWeatherFromLocalStorageRus() = getRussianCities()

    override fun getWeatherFromLocalStorageWorld() = getWorldCities()
}