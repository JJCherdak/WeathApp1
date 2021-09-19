package com.geekbrains.weathapp.ui.main.model

import com.geekbrains.weathapp.ui.main.model.Repository

class RepositoryImpl : Repository {

    override fun getWeatherFromServer(): Weather {
        return Weather()
    }

    override fun getWeatherFromLocalStorage(): Weather {
        return Weather()
    }
}