package com.manarelsebaay13.amazonaws.di

import com.manarelsebaay13.amazonaws.core.utils.DefaultDispatcherProvider
import com.manarelsebaay13.amazonaws.core.utils.DispatcherProvider
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideDispatcherProvider(): DispatcherProvider = DefaultDispatcherProvider()

}