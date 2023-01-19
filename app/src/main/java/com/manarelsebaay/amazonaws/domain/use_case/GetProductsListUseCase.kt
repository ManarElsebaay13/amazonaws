package com.manarelsebaay13.amazonaws.domain.use_case

import com.manarelsebaay13.amazonaws.core.utils.DispatcherProvider
import com.manarelsebaay13.amazonaws.repository.AmazonawsRepository
import kotlinx.coroutines.withContext
import com.manarelsebaay13.amazonaws.data.remote.dto.Result
import com.manarelsebaay13.amazonaws.domain.model.Product
import javax.inject.Inject


class GetProductsListUseCase @Inject constructor(
    private val repository: AmazonawsRepository,
    private val dispatcherProvider: DispatcherProvider
)
{
    @Throws(Throwable::class)
    suspend fun getProductsInfoList(): List<Product> {
        return withContext(dispatcherProvider.io()) {
            repository.getProducts().map { it.toProductsInfo() }
        }
    }
}

private fun Result.toProductsInfo() : Product=
    Product(
        uid = uid,
        name=name,
        imageUrlsThumbnails=imageUrlsThumbnails,
        imageUrls = imageUrls,
        createdAt= createdAt,
        price = price
    )

