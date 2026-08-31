package com.example.api_rest.domain.repository

import com.example.api_rest.domain.model.ProductModel

interface ProductRepository {
    suspend fun GetProductById(
        id: Int
    ): ProductModel

}