package com.manarelsebaay13.amazonaws.data.remote.api

import com.manarelsebaay13.amazonaws.data.remote.dto.AmazonawsResponse
import retrofit2.http.GET


interface AmazonawsApi {

    @GET("default/dynamodb-writer")
    suspend fun getProducts():AmazonawsResponse
}