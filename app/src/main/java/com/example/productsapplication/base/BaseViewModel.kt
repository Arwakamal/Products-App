package com.example.productsapplication.base

import androidx.lifecycle.ViewModel
import com.example.productsapplication.model.ViewMessage
import com.example.domain.common.InternetConnectionError
import com.example.domain.common.Resource

open class BaseViewModel : ViewModel() {
    fun <T> extractViewMessage(resource: Resource<T>): ViewMessage? =
        when (resource) {
            is Resource.ServerFail -> {
                ViewMessage(
                    message = resource.error.message ?: "Something went wrong",
                )
            }

            is Resource.Fail -> {
                when (resource.exception) {
                    is InternetConnectionError -> {
                        ViewMessage(
                            message = "Please check your internet connection",
                        )
                    }

                    else -> {
                        ViewMessage(
                            message = resource.exception.message ?: "Something went wrong",
                        )
                    }
                }
            }

            else -> null
        }
}
