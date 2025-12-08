package com.azad.composeuiandroidlab.rowcolumns

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.azad.composeuiandroidlab.R

@Preview(showBackground = true, widthDp = 300, heightDp = 500)
@Composable
fun RowColumnExample() {
    Row (
        modifier = Modifier.wrapContentWidth()
            .padding(16.dp),
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.Top
    ){
        Image(
            painter = painterResource(id = R.drawable.user_img1),
            contentDescription = null,
            modifier = Modifier.size(36.dp))

        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.Start
        ) {
            Text(text = "Title")
            Text(text = "subtitle",
                modifier = Modifier.wrapContentWidth(),
                    style = TextStyle(
                        fontSize = 8.sp,
                        fontWeight = FontWeight.W700,
                        color = Color.Red
                    )
                )

        }
    }
}