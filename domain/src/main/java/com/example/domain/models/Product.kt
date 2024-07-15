package com.example.domain.models

import kotlinx.parcelize.Parcelize
import android.os.Parcelable
import com.google.gson.annotations.SerializedName

data class Product(
	val id: Int? = null,
	val images: List<String?>? = null,
	val title: String? = null,
	val rating: Double? = null,
	val price: Double? = null,
	val discountPercentage: Double? = null,
)
