package com.example.api_rest.data.mapper

import com.example.api_rest.data.remote.dto.req.product.Product
import com.example.api_rest.domain.model.ProductModel

fun Product.toDomain(): ProductModel {
    return ProductModel(
        id = id,
        title = title,
        description = description,
        category = category,
        price = price
    )
}