package com.example.borutoapp.di

import android.content.Context
import com.example.borutoapp.data.repository.DataStoreOperationsImpl
import com.example.borutoapp.data.repository.Repository
import com.example.borutoapp.domain.repository.DataStoreOperations
import com.example.borutoapp.domain.use_case.UseCases
import com.example.borutoapp.domain.use_case.get_all_heroes.GetAllHeroesUseCase
import com.example.borutoapp.domain.use_case.read_onboarding.ReadOnBoardingUseCase
import com.example.borutoapp.domain.use_case.save_onboarding.SaveOnBoardingUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    @Singleton
    fun provideDataStoreOperations(
        @ApplicationContext context: Context
    ): DataStoreOperations{
        return DataStoreOperationsImpl(context = context)
    }

    @Provides
    @Singleton
    fun providesUseCases(repository: Repository): UseCases{
        return UseCases(
            saveOnBoardingUseCase = SaveOnBoardingUseCase(repository = repository),
            readOnBoardingUseCase = ReadOnBoardingUseCase(repository = repository),
            getAllHeroesUseCase = GetAllHeroesUseCase(repository = repository)
        )
    }

}