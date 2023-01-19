package com.manarelsebaay13.amazonaws.repository

import com.manarelsebaay13.amazonaws.data.remote.dto.Result


interface  AmazonawsRepository {

    suspend fun getProducts():List<Result>
}