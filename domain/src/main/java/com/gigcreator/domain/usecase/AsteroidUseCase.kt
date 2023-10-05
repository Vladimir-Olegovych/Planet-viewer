package com.gigcreator.domain.usecase

import com.gigcreator.domain.models.asteroid.Asteroid
import com.gigcreator.domain.repository.AsteroidRepository

class AsteroidUseCase(private val repository: AsteroidRepository) {
    suspend fun execute(key: String): Asteroid {
        return repository.getAsteroid(key)
    }
}