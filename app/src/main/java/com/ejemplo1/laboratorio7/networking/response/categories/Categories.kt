package com.ejemplo1.laboratorio7.networking.response.categories

import com.google.gson.annotations.SerializedName

data class Categories(
    @SerializedName("idCategory") val id: String,
    @SerializedName("strCategory") val name: String?,
    @SerializedName("strCategoryDescription") val description: String,
    @SerializedName("strCategoryThumb") val imageUrl: String
)