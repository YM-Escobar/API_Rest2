package com.example.api_rest.domain.usecase

import com.example.api_rest.data.remote.dto.req.product.Product
import com.example.api_rest.domain.model.ProductModel
import com.example.api_rest.domain.repository.ProductRepository
import jakarta.inject.Inject

class GetProductUseCase @Inject constructor(
    private val repository: ProductRepository
){
    suspend fun InvokeProduct(
        id: Int
    ): ProductModel {
        return repository.GetProductById(id)
    }
}