package com.gigcreator.planetviewer.presentation.di

import com.gigcreator.domain.repository.MarsRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.jackson.JacksonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DataModule {

    @Provides
    @Singleton
    fun provideRetrofit():
            Retrofit = Retrofit.Builder()
        .baseUrl("https://api.nasa.gov/mars-photos/api/v1/rovers/curiosity/")
        .addConverterFactory(JacksonConverterFactory.create())
        .build()

    @Provides
    @Singleton
    fun provideMarsRepository(retrofit: Retrofit): MarsRepository = retrofit.create(MarsRepository::class.java)

}