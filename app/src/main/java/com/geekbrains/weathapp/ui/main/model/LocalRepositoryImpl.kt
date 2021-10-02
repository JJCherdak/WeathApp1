package com.geekbrains.weathapp.ui.main.model

import com.geekbrains.weathapp.ui.main.convertHistoryEntityToWeather
import com.geekbrains.weathapp.ui.main.convertWeatherToEntity
import com.geekbrains.weathapp.ui.main.room.HistoryDAO

class LocalRepositoryImpl(private val localDataSource: HistoryDAO) :
    LocalRepository {

    override fun getAllHistory(): List<Weather> {
        return convertHistoryEntityToWeather(localDataSource.all())
    }

    override fun saveEntity(weather: Weather) {
        localDataSource.insert(convertWeatherToEntity(weather))
    }
}