package com.azad.composeuiandroidlab.composenavigation.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.azad.composeuiandroidlab.composenavigation.ScreenRoutes
import com.azad.composeuiandroidlab.composenavigation.screens.routes.UserDetailsRoute

@Composable
fun UserScreen(navController: NavController) {
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("User Screen")
        Button(onClick = {navController.navigate( UserDetailsRoute.route + UserDetailsRoute.passArgs("shekahr", 30, true, 1234567890L))}) { Text("Go to Screen 1")}
       // Button(onClick = {navController.navigate(UserDetailsRoute.passArgs("shekahr", 30, true, 1234567890L))}) { Text("Go to Screen 1")}


    }

}