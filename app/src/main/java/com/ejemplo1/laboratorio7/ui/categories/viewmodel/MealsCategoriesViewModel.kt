package com.ejemplo1.laboratorio7.ui.categories.viewmodel

import android.util.Log
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ejemplo1.laboratorio7.networking.response.categories.Categories
import com.ejemplo1.laboratorio7.ui.categories.repositories.MealsCategoryRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MealsCategoriesViewModel(private val repository: MealsCategoryRepository = MealsCategoryRepository()): ViewModel() {

    private val _categories = MutableLiveData<List<Categories>>()
    val categories: LiveData<List<Categories>> = _categories


    fun fetchCategories() {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val meals = repository.getMealsCategories()
                _categories.postValue(meals)
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }
}