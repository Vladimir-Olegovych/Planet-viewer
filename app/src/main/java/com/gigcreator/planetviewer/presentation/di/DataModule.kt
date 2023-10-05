package com.gigcreator.planetviewer.presentation.di

import com.gigcreator.domain.repository.AsteroidRepository
import com.gigcreator.domain.repository.MarsRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.jackson.JacksonConverterFactory
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DataModule {

    @Provides
    @Singleton
    @Named("Mars")
    fun provideRetrofitMars():
            Retrofit = Retrofit.Builder()
        .baseUrl("https://api.nasa.gov/mars-photos/api/v1/rovers/curiosity/")
        .addConverterFactory(JacksonConverterFactory.create())
        .build()

    @Provides
    @Singleton
    @Named("Asteroid")
    fun provideRetrofitAsteroid():
            Retrofit = Retrofit.Builder()
        .baseUrl("https://api.nasa.gov/neo/rest/v1/neo/")
        .addConverterFactory(JacksonConverterFactory.create())
        .build()


    @Provides
    @Singleton
    fun provideMarsRepository(@Named("Mars") retrofit: Retrofit): MarsRepository = retrofit.create(MarsRepository::class.java)


    @Provides
    @Singleton
    fun provideAsteroidRepository(@Named("Asteroid") retrofit: Retrofit): AsteroidRepository = retrofit.create(AsteroidRepository::class.java)

}