package com.example.weaatherapplication

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.weaatherapplication.Adapters.WeatherModel

class MainViewModel : ViewModel() {
    val LiveDataCurrent = MutableLiveData<WeatherModel>()
    val LiveDataList = MutableLiveData<List<WeatherModel>>()

}