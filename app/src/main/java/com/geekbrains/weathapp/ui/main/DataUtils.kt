package com.geekbrains.weathapp.ui.main



import com.geekbrains.weathapp.ui.main.model.FactDTO
import com.geekbrains.weathapp.ui.main.model.Weather
import com.geekbrains.weathapp.ui.main.model.WeatherDTO
import com.geekbrains.weathapp.ui.main.model.getDefaultCity

fun convertDtoToModel(weatherDTO: WeatherDTO): List<Weather> {
    val fact: FactDTO = weatherDTO.fact!!
    return listOf(Weather(getDefaultCity(), fact.temp!!, fact.feels_like!!, fact.condition!!, fact.icon))
}