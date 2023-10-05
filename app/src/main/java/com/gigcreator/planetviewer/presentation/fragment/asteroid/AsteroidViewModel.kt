package com.gigcreator.planetviewer.presentation.fragment.asteroid

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.gigcreator.domain.models.asteroid.Asteroid
import com.gigcreator.domain.usecase.AsteroidUseCase
import com.gigcreator.planetviewer.presentation.constants.Constants
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AsteroidViewModel @Inject constructor(private val asteroidUseCase: AsteroidUseCase): ViewModel() {

    private val _resultLiveData = MutableLiveData<Asteroid>()
    val resultLiveData: LiveData<Asteroid> = _resultLiveData

    fun getAsteroid(){
        viewModelScope.launch(Dispatchers.IO){
            _resultLiveData.postValue(asteroidUseCase.execute(Constants.API_KEY))
        }
    }
}