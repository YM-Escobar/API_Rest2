package com.example.api_rest.ui.viewmodel

import androidx.compose.runtime.mutableStateSetOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.api_rest.domain.usecase.GetProductUseCase
import com.example.api_rest.ui.state.ProductUiState
import dagger.hilt.android.lifecycle.HiltViewModel
import jakarta.inject.Inject
import kotlinx.coroutines.launch

@HiltViewModel
class ProductViewModel @Inject constructor(
    private val Product: GetProductUseCase
):ViewModel() {

    fun getProductById(id: Int){
        viewModelScope.launch {
            try {
                val Result = Product.InvokeProduct(id)
            } catch (e: Exception){
                val Result= e.message
            }
        }
    }
}

