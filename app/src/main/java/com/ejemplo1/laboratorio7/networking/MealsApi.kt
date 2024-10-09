package com.ejemplo1.laboratorio7.networking

import com.ejemplo1.laboratorio7.networking.response.categories.MealsCategoriesResponse
import com.ejemplo1.laboratorio7.networking.response.meals.MealsResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface MealsApi {

    @GET("categories.php")
    suspend fun getMealsCategories(): MealsCategoriesResponse

    @GET("filter.php")
    suspend fun filterByCategory(
        @Query("c") category: String
    ): MealsResponse
}