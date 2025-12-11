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
fun UserDetailsScreen( userName: String?=null,age: Int?=null,userId: Long?=null,isPremium: Boolean?=null) {
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("UserName is $userName")
        Text("User Age is $age")
        Text("User id is $userId")
        Text("User isPremium $isPremium")



    }

}