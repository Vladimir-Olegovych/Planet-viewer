package com.gigcreator.data.repository

import com.gigcreator.domain.models.asteroid.Asteroid
import com.gigcreator.domain.repository.AsteroidRepository

class AsteroidRepositoryImpl(private val asteroidRepository: AsteroidRepository): AsteroidRepository {
    override suspend fun getAsteroid(key: String): Asteroid {
        return asteroidRepository.getAsteroid(key)
    }
}