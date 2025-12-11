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

@Composable
fun ScreenB(navController: NavController,name:String) {
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("Screen B and name is $name")
        Button(onClick = {navController.navigate(ScreenRoutes.screenC)}) { Text("Go to Screen C") }

    }

}