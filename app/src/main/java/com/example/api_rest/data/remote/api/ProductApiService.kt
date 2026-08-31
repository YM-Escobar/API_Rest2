package com.example.api_rest.data.remote.api

import com.example.api_rest.data.remote.dto.req.product.Product
import retrofit2.http.GET
import retrofit2.http.Path

interface ProductApiService {
    @GET("products/{id}")
    suspend fun getProductById(
        @Path("id") id: Int
    ) : Product
}