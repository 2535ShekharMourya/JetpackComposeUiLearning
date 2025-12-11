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
import com.azad.composeuiandroidlab.composenavigation.screens.routes.ScreenBRoute

@Composable
fun ScreenA(navController: NavController) {
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("Screen A")
        Button(onClick = {navController.navigate(ScreenBRoute.passUserName("AzadShekhar"))}) { Text("Go to Screen B")}
        Button(onClick = {navController.navigate(ScreenBRoute.passUserAge(24))}) { Text("Go to Screen B")}
        Button(onClick = {navController.navigate(ScreenBRoute.passUserNameAndAge("azad", 24))}) { Text("Go to Screen B")}
       // Button(onClick = {navController.navigate(ScreenRoutes.screenB+"/123")}) { Text("Go to Screen B")}

    }

}