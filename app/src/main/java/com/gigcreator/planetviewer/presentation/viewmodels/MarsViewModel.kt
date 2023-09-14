package com.gigcreator.planetviewer.presentation.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.gigcreator.planetviewer.domain.constants.Constants
import com.gigcreator.planetviewer.domain.models.Mars
import com.gigcreator.planetviewer.domain.repository.MarsApiRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MarsViewModel(private var date: String = "2015-06-03", private val repository: MarsApiRepository = MarsApiRepository.newInstance()): ViewModel() {

    fun setDate(date: String){
        this.date = date
    }

    fun getMars(callback: (Mars) -> Unit){
        viewModelScope.launch(Dispatchers.IO){
            val number = repository.getMars(date ,Constants.API_KEY)
            launch(Dispatchers.Main){
                callback(number)
            }
        }
    }
}