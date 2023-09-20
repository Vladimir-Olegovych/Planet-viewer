package com.gigcreator.domain.repository

import com.gigcreator.domain.models.asteroid.Asteroid
import retrofit2.Retrofit
import retrofit2.converter.jackson.JacksonConverterFactory
import retrofit2.create
import retrofit2.http.GET
import retrofit2.http.Query

interface AsteroidApiRepository {
    @GET("browse?")
    suspend fun getAsteroid(
        @Query("api_key") key: String
    ): Asteroid

    companion object {
        fun newInstance(baseUrl: String = "https://api.nasa.gov/neo/rest/v1/neo/"): AsteroidApiRepository = Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(JacksonConverterFactory.create())
            .build()
            .create()
    }
}