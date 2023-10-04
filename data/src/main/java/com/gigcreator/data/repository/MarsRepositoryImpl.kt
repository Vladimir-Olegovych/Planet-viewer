package com.gigcreator.data.repository

import com.gigcreator.domain.models.mars.Mars
import com.gigcreator.domain.repository.MarsRepository


class MarsRepositoryImpl(private val marsRepository: MarsRepository) : MarsRepository {
    override suspend fun getMars(date: String, key: String): Mars {
        return marsRepository.getMars(date, key)
    }
}