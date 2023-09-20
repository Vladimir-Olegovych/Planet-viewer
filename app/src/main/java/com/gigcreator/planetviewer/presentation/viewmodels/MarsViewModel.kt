package com.gigcreator.planetviewer.presentation.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.gigcreator.planetviewer.presentation.constants.Constants
import com.gigcreator.domain.repository.MarsApiRepository
import com.gigcreator.domain.models.mars.Mars
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MarsViewModel(private var date: String = "2015-06-03", private val repository: MarsApiRepository = MarsApiRepository.newInstance()): ViewModel() {

    fun setDate(date: String){
        this.date = date
    }

    fun getMars(callback: (Mars) -> Unit){
        viewModelScope.launch(Dispatchers.IO){
            val number = repository.getMars(date , Constants.API_KEY)
            launch(Dispatchers.Main){
                callback(number)
            }
        }
    }

}