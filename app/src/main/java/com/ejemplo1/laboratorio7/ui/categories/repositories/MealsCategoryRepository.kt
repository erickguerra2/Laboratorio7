package com.ejemplo1.laboratorio7.ui.categories.repositories

import com.ejemplo1.laboratorio7.networking.response.categories.Categories
import com.ejemplo1.laboratorio7.networking.webservices.MealsWebService

class MealsCategoryRepository(private val webService: MealsWebService = MealsWebService()) {

    suspend fun getMealsCategories(): List<Categories> {
        return webService.getMealsCategories().categories
    }
}