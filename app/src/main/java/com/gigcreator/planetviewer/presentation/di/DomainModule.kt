package com.gigcreator.planetviewer.presentation.di

import com.gigcreator.domain.repository.AsteroidRepository
import com.gigcreator.domain.repository.MarsRepository
import com.gigcreator.domain.usecase.AsteroidUseCase
import com.gigcreator.domain.usecase.MarsUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
class DomainModule {

    @Provides
    fun provideMarsUseCase(marsRepository: MarsRepository): MarsUseCase{
        return MarsUseCase(repository = marsRepository)
    }

    @Provides
    fun provideAsteroidUseCase(asteroidRepository: AsteroidRepository): AsteroidUseCase {
        return AsteroidUseCase(repository = asteroidRepository)
    }

}