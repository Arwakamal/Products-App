package com.example.data.api.model

import android.os.Parcel
import android.os.Parcelable
import com.example.domain.models.Product
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ProductDto(
	@field:SerializedName("id")
	val id: Int? = null,
	@field:SerializedName("images")
	val images: List<String?>? = null,
	@field:SerializedName("rating")
	val rating: Double? = null,
	@field:SerializedName("title")
	val title: String? = null,
	@field:SerializedName("price")
	val price: Double? = null,
	@field:SerializedName("discountPercentage")
	val discountPercentage: Double? = null,
) : Parcelable {
	constructor(parcel: Parcel) : this(
		parcel.readValue(Int::class.java.classLoader) as? Int,
		parcel.createStringArrayList(),
		parcel.readValue(Double::class.java.classLoader) as? Double,
		parcel.readString(),
		parcel.readValue(Double::class.java.classLoader) as? Double,
		parcel.readValue(Double::class.java.classLoader) as? Double
	) {
	}

	fun toProduct(): Product =
		Product(
			id = id,
			images = images,
			rating = rating,
			title = title,
			price = price,
			discountPercentage = discountPercentage,
		)




}
