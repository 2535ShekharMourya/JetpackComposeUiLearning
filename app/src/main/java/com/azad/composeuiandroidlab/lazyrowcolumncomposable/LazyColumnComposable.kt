package com.azad.composeuiandroidlab.lazyrowcolumncomposable

import android.util.Log
import androidx.compose.foundation.gestures.ScrollableState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.azad.composeuiandroidlab.R

@Composable
fun ListItems() {
//ScrollableColumn()
    SrollableLazyColum()
}

@Composable
fun SrollableLazyColum(){
    // minic Recyclerview
    val myList = listOf("A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z")
    val myList2 = listOf(1,2,3 ,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26)
LazyColumn(){
    itemsIndexed(myList2, itemContent = { index, item ->
        TextItem("Item $item")
    })

//    items(100){
//        TextItem("Item $it")
//    }
}
}


@Composable
fun ScrollableColumn() {
    // it is good when you fixed size list items or fixed data but if it is dynamic like api response
    // then you should use LazyColumn
    val scrollState = rememberScrollState()
    Column(
        Modifier
            .verticalScroll(scrollState)
            .padding(16.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        for (i in 1..100) {
            TextItem("Item $i")
        }
    }
}
@Composable
fun TextItem(text: String) {
    Log.d("items", text)
        Text(text,
            modifier = Modifier.padding(8.dp)
            .fillMaxSize(),
            textAlign = TextAlign.Center,
            style = TextStyle(fontSize = 24.sp))
}



//@Preview(showBackground = true, widthDp = 300, heightDp = 500)
@Composable
fun BuildLazyColumn() {
    val arr = arrayListOf(" Item 1", "Item 2", "Item 3 ", "Item 4"," Item 1"," Item 1", "Item 2", "Item 3 ", "Item 4"," Item 1",
        "Item 2", "Item 3 ", "Item 4"," Item 1", "Item 2", "Item 3 ", "Item 4"," Item 1", "Item 2", "Item 3 ", "Item 4",
        "Item 2", "Item 3 ", "Item 4"," Item 1", "Item 2", "Item 3 ", "Item 4"," Item 1", "Item 2", "Item 3 ", "Item 4")
    LazyColumn() {
        items(count = arr.size){pos->
            Card(modifier = Modifier.padding(8.dp)) {
                Text( text = arr[pos], modifier = Modifier.padding(8.dp))
            }

        }
    }
}

