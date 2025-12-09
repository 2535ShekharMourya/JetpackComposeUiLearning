package com.azad.composeuiandroidlab.lazyrowcolumncomposable

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.azad.composeuiandroidlab.R
data class MarvelCharacter(val image:Int,val name: String, val age: Int)

@Preview(showBackground = true, widthDp = 300, heightDp = 500)
@Composable
fun MarvelLazyColumn() {
    val marvelCharacters = getAllItemList()
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        items(marvelCharacters.size) { index ->
            val character = marvelCharacters[index]
            MarvelItem(character)
        }
    }
//    LazyRow(
//        modifier = Modifier.fillMaxSize(),
//        horizontalArrangement = Arrangement.Start,
//        verticalAlignment = Alignment.CenterVertically
//    ) {
//        items(marvelCharacters.size) { index ->
//            val character = marvelCharacters[index]
//            MarvelItem(character)
//        }
//    }
}
    @Composable
    fun MarvelItem(item: MarvelCharacter) {
        val context =  LocalContext.current
        Row(modifier = Modifier.fillMaxWidth().padding(16.dp).clickable {
            Toast.makeText(context, "Clicked Row item ", Toast.LENGTH_SHORT).show()
        }
            ) {
            Image(
                painter = painterResource(id = item.image),
                contentDescription = item.name,
                modifier = Modifier.clip(CircleShape).size(64.dp).scale(2.0f).clickable {
                    Toast.makeText(context, "Clicked image ", Toast.LENGTH_SHORT).show()
                }
            )
            Column(modifier = Modifier.fillMaxWidth().padding(8.dp).clickable {
                Toast.makeText(context, "Clicked Column item ", Toast.LENGTH_SHORT).show()
            },
                horizontalAlignment = Alignment.Start) {
                Text(
                    text = item.name, modifier = Modifier.padding(0.dp).clickable {
                        Toast.makeText(context, "Clicked ${item.name} ", Toast.LENGTH_SHORT).show()
                    },
                    style = TextStyle(fontSize = 18.sp, fontWeight = FontWeight.Bold)
                )
                Text(
                    text = "${item.age} years old",
                    modifier = Modifier.padding(0.dp).clickable {
                        Toast.makeText(context, "Clicked ${item.age} ", Toast.LENGTH_SHORT).show()
                    },
                    style = TextStyle(fontSize = 14.sp, fontWeight = FontWeight.Normal)
                )
            }
        }
    }

fun getAllItemList(): List<MarvelCharacter> {
    val list = listOf(MarvelCharacter(R.drawable.user_img2,"Iron Man", 35),
        MarvelCharacter(R.drawable.user_img2,"Spider Man", 23),
        MarvelCharacter(R.drawable.user_img2,"Thor", 1500),
        MarvelCharacter(R.drawable.user_img2,"Hulk", 40),
        MarvelCharacter(R.drawable.user_img2,"Black Widow", 30),
        MarvelCharacter(R.drawable.user_img2,"Spider Man", 23),
        MarvelCharacter(R.drawable.user_img2,"Thor", 1500),
        MarvelCharacter(R.drawable.user_img2,"Hulk", 40),
        MarvelCharacter(R.drawable.user_img2,"Black Widow", 30),
        MarvelCharacter(R.drawable.user_img2,"Spider Man", 23),
        MarvelCharacter(R.drawable.user_img2,"Thor", 1500),
        MarvelCharacter(R.drawable.user_img2,"Hulk", 40),
        MarvelCharacter(R.drawable.user_img2,"Black Widow", 30)
        )

    return list
}
