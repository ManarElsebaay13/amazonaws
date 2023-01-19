package com.manarelsebaay13.amazonaws.data.repository

import com.manarelsebaay13.amazonaws.data.remote.api.AmazonawsApi
import com.manarelsebaay13.amazonaws.data.remote.dto.Result
import com.manarelsebaay13.amazonaws.repository.AmazonawsRepository
import javax.inject.Inject

class AmazonawsRepositoryImpl @Inject constructor(
      private val amazonawsApi: AmazonawsApi
) : AmazonawsRepository {

    override suspend fun getProducts(): List<Result> {
        return amazonawsApi.getProducts().results
    }

}