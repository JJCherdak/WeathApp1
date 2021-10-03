package com.geekbrains.weathapp.ui.main.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.geekbrains.weathapp.ui.main.model.Repository
import com.geekbrains.weathapp.ui.main.model.RepositoryImpl
import com.geekbrains.weathapp.ui.main.viewmodel.AppState
import java.lang.Thread.sleep

class MainViewModel(
    private val liveDataToObserve: MutableLiveData<AppState> = MutableLiveData(),
    private val repositoryImpl: Repository = RepositoryImpl()
) :
    ViewModel() {

    fun getLiveData() = liveDataToObserve

    fun getWeatherFromLocalSourceRus() = getDataFromLocalSource(isRussian = true)

    fun getWeatherFromLocalSourceWorld() = getDataFromLocalSource(isRussian = false)

    fun getWeatherFromRemoteSource() = getDataFromLocalSource(isRussian = true)

    private fun getDataFromLocalSource(isRussian: Boolean) {
        liveDataToObserve.value = AppState.Loading
        Thread {
            sleep(5000)
            liveDataToObserve.postValue(AppState.Success(if (isRussian) repositoryImpl.getWeatherFromLocalStorageRus() else repositoryImpl.getWeatherFromLocalStorageWorld()))
        }.start()
    }
}