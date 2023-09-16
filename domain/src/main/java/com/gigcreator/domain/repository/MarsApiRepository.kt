package com.gigcreator.domain.repository

import com.gigcreator.domain.models.Mars
import retrofit2.Retrofit
import retrofit2.converter.jackson.JacksonConverterFactory
import retrofit2.http.GET
import retrofit2.create
import retrofit2.http.Query

interface MarsApiRepository {

    @GET("photos?&")
    suspend fun getMars(
        @Query("earth_date") date: String,
        @Query("api_key") key: String
    ): Mars

    companion object {
        fun newInstance(baseUrl: String = "https://api.nasa.gov/mars-photos/api/v1/rovers/curiosity/"): MarsApiRepository = Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(JacksonConverterFactory.create())
            .build()
            .create()
    }
}