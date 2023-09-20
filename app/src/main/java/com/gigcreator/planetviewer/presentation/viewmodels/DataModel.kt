package com.gigcreator.planetviewer.presentation.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.gigcreator.domain.models.asteroid.NearEarthObject

class DataModel: ViewModel() {
    val near_earth_objects: MutableLiveData<NearEarthObject> by lazy {
        MutableLiveData<NearEarthObject>()
    }
    val position: MutableLiveData<Int> by lazy {
        MutableLiveData<Int>()
    }
}