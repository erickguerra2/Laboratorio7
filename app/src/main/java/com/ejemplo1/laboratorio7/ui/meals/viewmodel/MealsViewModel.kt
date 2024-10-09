package com.ejemplo1.laboratorio7.ui.meals.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ejemplo1.laboratorio7.networking.response.meals.Meal
import com.ejemplo1.laboratorio7.ui.meals.repositories.MealsRepository
import kotlinx.coroutines.launch

class MealsViewModel (val repository: MealsRepository = MealsRepository()): ViewModel() {

    private val _meals = MutableLiveData<List<Meal>>()
    val meals: LiveData<List<Meal>> = _meals

    fun fetchByCategory(category: String) {
        viewModelScope.launch {
            try {
                val meals = repository.filterByCategory(category)
                _meals.value = meals
            } catch (e: Exception) {
                Log.e("MealsViewModel", e.message.toString());
            }
        }
    }
}