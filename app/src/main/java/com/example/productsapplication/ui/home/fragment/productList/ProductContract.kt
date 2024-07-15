package com.example.productsapplication.ui.home.fragment.productList

import androidx.lifecycle.LiveData
import com.example.domain.models.Product
import com.example.productsapplication.model.ViewMessage
import kotlinx.coroutines.flow.StateFlow

class ProductContract {
    interface ProductsViewModel {
        val state: StateFlow<State>
        val event: LiveData<Event>

        fun doAction(action: Action)
    }

    sealed class Action {
        data object LoadProducts : Action()
    }

    sealed class Event {
        data class ShowMessage(
            val message: ViewMessage,
        ) : Event()
    }

    sealed class State {
        data object Loading : State()

        data class Success(
            val productList: List<Product>? = null,
        ) : State()
    }
}
