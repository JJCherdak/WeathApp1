package com.geekbrains.weathapp.ui.main.model

interface LocalRepository {
    fun getAllHistory(): List<Weather>
    fun saveEntity(weather: Weather)
}