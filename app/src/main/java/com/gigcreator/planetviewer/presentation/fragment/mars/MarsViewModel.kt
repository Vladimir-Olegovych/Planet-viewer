package com.gigcreator.planetviewer.presentation.fragment.mars

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.gigcreator.domain.models.mars.Mars
import com.gigcreator.domain.usecase.MarsUseCase
import com.gigcreator.planetviewer.presentation.constants.Constants
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MarsViewModel @Inject constructor(private val marsUseCase: MarsUseCase): ViewModel() {

    private val _resultLiveData = MutableLiveData<Mars>()
    val resultLiveData: LiveData<Mars> = _resultLiveData

    fun getMars(date: String){
        viewModelScope.launch(Dispatchers.IO){
            _resultLiveData.postValue(marsUseCase.execute(date , Constants.API_KEY))
        }
    }
}