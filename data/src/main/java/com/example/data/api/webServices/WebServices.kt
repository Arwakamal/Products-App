package com.example.data.api.webServices

import com.example.data.api.model.Response
import com.example.domain.models.Product
import kotlinx.coroutines.flow.Flow
import retrofit2.http.GET

interface ProductWebServices {
    @GET("/products")
    suspend fun getProducts(): Response
}
