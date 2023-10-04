package com.gigcreator.domain.repository

import com.gigcreator.domain.models.mars.Mars
import retrofit2.http.GET
import retrofit2.http.Query

interface MarsRepository {
    @GET("photos?&")
    suspend fun getMars(
        @Query("earth_date") date: String,
        @Query("api_key") key: String
    ): Mars
}