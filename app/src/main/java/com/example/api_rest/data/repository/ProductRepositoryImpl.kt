package com.example.api_rest.data.repository

import com.example.api_rest.data.mapper.toDomain
import com.example.api_rest.data.remote.api.ProductApiService
import com.example.api_rest.domain.model.ProductModel
import com.example.api_rest.domain.repository.ProductRepository
import jakarta.inject.Inject

class ProductRepositoryImpl @Inject constructor(
    private val api: ProductApiService
): ProductRepository {
    override suspend fun GetProductById(id: Int): ProductModel {
        val response = api.getProductById(id)
        return response.toDomain()
    }
}