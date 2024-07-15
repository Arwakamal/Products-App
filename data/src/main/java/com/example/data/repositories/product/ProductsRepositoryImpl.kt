package com.example.data.repositories.product

import com.example.data.contract.product.ProductsOnlineDataSource
import com.example.data.toFlow
import com.example.domain.common.Resource
import com.example.domain.contract.product.ProductsRepository
import com.example.domain.models.Product
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class ProductsRepositoryImpl
@Inject
constructor(
    private val productsOnlineDataSource: ProductsOnlineDataSource,
) : ProductsRepository {
    override suspend fun getProducts(): Flow<Resource<List<Product>?>> =
        toFlow {
            productsOnlineDataSource.getProducts()
        }
}
