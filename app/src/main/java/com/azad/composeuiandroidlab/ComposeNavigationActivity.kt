package com.azad.composeuiandroidlab

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.azad.composeuiandroidlab.composenavigation.Routes
import com.azad.composeuiandroidlab.composenavigation.screens.ScreenA
import com.azad.composeuiandroidlab.composenavigation.screens.ScreenB
import com.azad.composeuiandroidlab.composenavigation.screens.ScreenC
import com.azad.composeuiandroidlab.composenavigation.screens.ScreenNavigations
import com.azad.composeuiandroidlab.ui.theme.ComposeUiAndroidLabTheme

class ComposeNavigationActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ScreenNavigations()
        }
    }
}

