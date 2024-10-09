package com.ejemplo1.laboratorio7.networking.response.mealdetail

import com.google.gson.annotations.SerializedName

data class MealDetail(
    @SerializedName("idMeal") val idMeal: String,
    @SerializedName("strMeal") val strMeal: String,
    @SerializedName("strDrinkAlternate") val strDrinkAlternate: String?,
    @SerializedName("strCategory") val strCategory: String,
    @SerializedName("strArea") val strArea: String,
    @SerializedName("strInstructions") val strInstructions: String,
    @SerializedName("strMealThumb") val strMealThumb: String,
    @SerializedName("strTags") val strTags: String?,
    @SerializedName("strYoutube") val strYoutube: String?,
    @SerializedName("strIngredient1") val strIngredient1: String?,
    @SerializedName("strIngredient2") val strIngredient2: String?,
    @SerializedName("strIngredient3") val strIngredient3: String?,
    @SerializedName("strMeasure1") val strMeasure1: String?,
    @SerializedName("strMeasure2") val strMeasure2: String?,
    @SerializedName("strMeasure3") val strMeasure3: String?,
    @SerializedName("strSource") val strSource: String?
)