package com.example.data.api.model

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Response(
	@field:SerializedName("total")
	val total: Int? = null,
	@field:SerializedName("limit")
	val limit: Int? = null,
	@field:SerializedName("skip")
	val skip: Int? = null,
	@field:SerializedName("products")
	val products: List<ProductDto?>? = null,
	@field:SerializedName("statusMsg")
	val statusMsg: String? = null,
	@field:SerializedName("message")
	val message: String? = null,
) : Parcelable
