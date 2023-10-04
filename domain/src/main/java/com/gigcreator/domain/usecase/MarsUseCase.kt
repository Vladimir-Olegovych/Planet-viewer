package com.gigcreator.domain.usecase

import com.gigcreator.domain.models.mars.Mars
import com.gigcreator.domain.repository.MarsRepository

class MarsUseCase(private val repository: MarsRepository) {
    suspend fun execute(date: String, key: String): Mars {
        return repository.getMars(date, key)
    }
}