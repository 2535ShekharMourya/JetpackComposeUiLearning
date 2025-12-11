package com.azad.composeuiandroidlab.composenavigation.screens

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.azad.composeuiandroidlab.composenavigation.ScreenRoutes
import com.azad.composeuiandroidlab.composenavigation.screens.routes.PassStringRoute
import com.azad.composeuiandroidlab.composenavigation.screens.routes.Screen1Route
import com.azad.composeuiandroidlab.composenavigation.screens.routes.ScreenARoute
import com.azad.composeuiandroidlab.composenavigation.screens.routes.ScreenBRoute
import com.azad.composeuiandroidlab.composenavigation.screens.routes.UserDetailsRoute
import com.azad.composeuiandroidlab.composenavigation.screens.routes.UserScreenRoute

@Composable
fun ScreenNavigations(){

    // Pass single argument between two screens
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = ScreenARoute.route, builder = {
        composable(ScreenARoute.route) { ScreenA(navController)  }
        composable(ScreenBRoute.route ,
            arguments = listOf(
               navArgument("userName") { type = NavType.StringType })
            ) {
            val name = it.arguments?.getString("userName")
            ScreenB(navController,name?: "Default Name")
        }
        composable(ScreenRoutes.screenC) { ScreenC{ navController.navigate(ScreenRoutes.screenA) }  }

        // Each Screen should have own Route it is clean and recommended

        // and so on you can add 1000s of Screen blow with routes each screen consider as a single Node in NavHostGraph


    })


// Passing multiple values from one screen to another screen
//    val navController = rememberNavController()
//    NavHost(navController = navController, startDestination = UserScreenRoute.route, builder = {
//        composable(UserScreenRoute.route) { UserScreen(navController)  }
//
//        composable(
//            route = UserDetailsRoute.route,
//            arguments = listOf(
//                navArgument("userName") { type = NavType.StringType },
//                navArgument("age") { type = NavType.IntType },
//                navArgument("isPremium") { type = NavType.BoolType },
//                navArgument("userId") { type = NavType.LongType }
//            )
//        ) { backStackEntry ->
//            val userName = backStackEntry.arguments?.getString("userName") ?: ""
//            val age = backStackEntry.arguments?.getInt("age") ?: 0
//            val isPremium = backStackEntry.arguments?.getBoolean("isPremium") ?: false
//            val userId = backStackEntry.arguments?.getLong("userId") ?: 0L
//
//            UserDetailsScreen(
//                userName,
//                age,
//                userId,
//                 isPremium
//            )
//
//        }
//
//        composable(ScreenRoutes.screenC) { ScreenC{ navController.navigate(ScreenRoutes.screenA) }  }
//    })
}