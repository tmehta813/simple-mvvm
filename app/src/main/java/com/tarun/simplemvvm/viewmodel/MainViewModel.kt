package com.tarun.simplemvvm.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.tarun.simplemvvm.repository.MainRepository

class MainViewModel : ViewModel() {

    private val repository = MainRepository()

    val fetchData = liveData {
        emit(repository.fetchData())
    }

    val storeData = liveData {
        emit(repository.storeData())
    }

}