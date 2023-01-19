package com.manarelsebaay13.amazonaws.di

import com.manarelsebaay13.amazonaws.data.remote.api.AmazonawsApi
import com.manarelsebaay13.amazonaws.data.repository.AmazonawsRepositoryImpl
import com.manarelsebaay13.amazonaws.repository.AmazonawsRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    @Singleton
    fun provideAmazonRepository(api: AmazonawsApi):AmazonawsRepository{
        return AmazonawsRepositoryImpl(api)
    }
}