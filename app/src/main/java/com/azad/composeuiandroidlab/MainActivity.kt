package com.azad.composeuiandroidlab

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import com.azad.composeuiandroidlab.ui.theme.ComposeUiAndroidLabTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {




//            ComposeUiAndroidLabTheme {
//                Surface(modifier = Modifier.fillMaxSize()) {
//                    MarvelLazyColumn()
//                    // whole screen UI here
//                }
//
//            }
        }
    }
}


//@Preview(showBackground = true,widthDp = 300, heightDp = 500)
@Composable
fun GreetingPreview() {
    ComposeUiAndroidLabTheme {

    }
}