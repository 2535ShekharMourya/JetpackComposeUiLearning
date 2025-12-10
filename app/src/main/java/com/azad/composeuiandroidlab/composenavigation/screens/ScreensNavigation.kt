package com.azad.composeuiandroidlab.composenavigation.screens

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.azad.composeuiandroidlab.composenavigation.Routes

@Composable
fun ScreenNavigations(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Routes.screenA, builder = {
        composable(Routes.screenA) { ScreenA(navController)  }
        composable(Routes.screenB+"/{name}") {
            val name = it.arguments?.getString("name")
            ScreenB(navController,name?: "Default Name")
        }
        composable(Routes.screenC) { ScreenC{ navController.navigate(Routes.screenA) }  }
    })
}