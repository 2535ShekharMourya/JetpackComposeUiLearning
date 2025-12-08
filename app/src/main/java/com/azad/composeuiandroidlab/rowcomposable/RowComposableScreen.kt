package com.azad.composeuiandroidlab.rowcomposable

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true, widthDp = 300, heightDp = 500)
@Composable
fun BasicRowLayout(){
    Row (modifier = Modifier
        . padding(8.dp)
        .shadow(8.dp, RoundedCornerShape(12.dp))
        .clip(RoundedCornerShape(12.dp))
        .background(Color.White)
        .border(2.dp, Color.Black, RoundedCornerShape(12.dp))
        .padding(8.dp)
        ,
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.Top
        )
    {
        Text(text = "Hello")
        Text(text = "World")
        Text(text = "Hello")
        Text(text = "World")
        Text(text = "Hello")
        Text(text = "World")



    }

}