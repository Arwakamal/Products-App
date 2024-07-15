package com.example.data.contract.product

import com.example.domain.models.Product
import kotlinx.coroutines.flow.Flow

interface ProductsOnlineDataSource {
    suspend fun getProducts(): List<Product>?
}