package com.manarelsebaay13.amazonaws.di

import com.manarelsebaay13.amazonaws.core.utils.Constants
import com.manarelsebaay13.amazonaws.data.remote.api.AmazonawsApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Provides
    fun provideAmazonApi():AmazonawsApi{
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(AmazonawsApi::class.java)
    }

}