package com.gigcreator.domain.repository

import com.gigcreator.domain.models.asteroid.Asteroid
import retrofit2.http.GET
import retrofit2.http.Query

interface AsteroidRepository {
    @GET("browse?")
    suspend fun getAsteroid(
        @Query("api_key") key: String
    ): Asteroid

}