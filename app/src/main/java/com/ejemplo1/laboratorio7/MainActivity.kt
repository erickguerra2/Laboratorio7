package com.ejemplo1.laboratorio7;

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.rememberNavController
import com.ejemplo1.laboratorio7.navigation.Navigation
import com.ejemplo1.laboratorio7.ui.theme.MealsWithRoomTheme

class MainActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MealsWithRoomTheme {
                Navigation(navController = rememberNavController())
            }
        }
    }
}