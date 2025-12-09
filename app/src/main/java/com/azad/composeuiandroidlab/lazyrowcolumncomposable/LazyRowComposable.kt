package com.azad.composeuiandroidlab.lazyrowcolumncomposable

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true, widthDp = 300, heightDp = 500)
@Composable
fun BuildLazyRow() {
    val arr = arrayListOf(" Item 1", "Item 2", "Item 3 ", "Item 4"," Item 1"," Item 1", "Item 2", "Item 3 ", "Item 4"," Item 1",
        "Item 2", "Item 3 ", "Item 4"," Item 1", "Item 2", "Item 3 ", "Item 4"," Item 1", "Item 2", "Item 3 ", "Item 4",
        "Item 2", "Item 3 ", "Item 4"," Item 1", "Item 2", "Item 3 ", "Item 4"," Item 1", "Item 2", "Item 3 ", "Item 4")
    LazyRow() {
        items(count = arr.size){pos->
            Card(modifier = Modifier.padding(8.dp)) {
                Text( text = arr[pos], modifier = Modifier.padding(8.dp))
            }

        }
    }
}