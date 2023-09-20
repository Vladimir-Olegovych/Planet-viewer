package com.gigcreator.planetviewer.presentation.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.gigcreator.domain.models.asteroid.Asteroid
import com.gigcreator.planetviewer.presentation.constants.Constants
import com.gigcreator.domain.repository.AsteroidApiRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class AsteroidViewModel(private val repository: AsteroidApiRepository = AsteroidApiRepository.newInstance()): ViewModel() {

    fun getAsteroid(callback: (Asteroid) -> Unit){
        viewModelScope.launch(Dispatchers.IO){
            val number = repository.getAsteroid(Constants.API_KEY)
            launch(Dispatchers.Main){
                callback(number)
            }
        }
    }
}