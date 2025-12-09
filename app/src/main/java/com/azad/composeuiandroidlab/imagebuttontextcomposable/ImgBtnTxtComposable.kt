package com.azad.composeuiandroidlab.imagebuttontextcomposable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.azad.composeuiandroidlab.R

//@Preview(showBackground = true, widthDp = 300, heightDp = 500)
@Composable
fun ImageComposable(){
    Image(painter = painterResource(id = R.drawable.user_img2), contentDescription = "Image",
        modifier = Modifier.fillMaxSize()
            .padding(2.dp)
            .clip(CircleShape)
            .border(2.dp, Color.Gray, CircleShape)
    )
}

@Preview(showBackground = true, widthDp = 300, heightDp = 500)
@Composable
fun BoxComposable(){
    Box(
        modifier = Modifier
            .size(200.dp)
            .background(Color.Yellow),
        contentAlignment = Alignment.Center
    ) {

//        Box(
//            modifier = Modifier
//                .matchParentSize()
//                .background(Color.Yellow)
//        )
        Text("Center Text because of contentAlignment is centered")
        Text("Hi Bro How are you?")   // uses contentAlignment

        Text("Bottom End ", modifier = Modifier.align(Alignment.BottomEnd))
        Text("Bottom Center ", modifier = Modifier.align(Alignment.BottomCenter))
        Text("Bottom start ", modifier = Modifier.align(Alignment.BottomStart))
        Text("TopStart ", modifier = Modifier.align(Alignment.TopStart))
        Text("TopEnd ", modifier = Modifier.align(Alignment.TopEnd))
        Text("TopCenter ", modifier = Modifier.align(Alignment.TopCenter))
        Text("CenterEnd ", modifier = Modifier.align(Alignment.CenterEnd))
        Text("CenterStart ", modifier = Modifier.align(Alignment.CenterStart))
        Text("Center ", modifier = Modifier.align(Alignment.Center))
    }
}