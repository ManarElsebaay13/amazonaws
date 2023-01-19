package com.manarelsebaay13.amazonaws.di

import com.manarelsebaay13.amazonaws.core.utils.DispatcherProvider
import com.manarelsebaay13.amazonaws.domain.use_case.GetProductsListUseCase
import com.manarelsebaay13.amazonaws.repository.AmazonawsRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule  {

    @Provides
    @Singleton
     fun provideGetProductsUseCasse(
        amazonawsRepository: AmazonawsRepository,
        dispatcherProvider: DispatcherProvider
    ):GetProductsListUseCase = GetProductsListUseCase(amazonawsRepository,dispatcherProvider)
}