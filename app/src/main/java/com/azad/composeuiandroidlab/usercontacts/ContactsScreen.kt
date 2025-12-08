package com.azad.composeuiandroidlab.usercontacts

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.azad.composeuiandroidlab.R

// Sample Contact Data Class
data class Contact(
    val name: String,
    val phoneNumber: String,
    val imageResId: Int,
    val time: String,
    val date: String
)
@Preview(showBackground = true, widthDp = 300, heightDp = 500)
@Composable
fun UserContactsScreen() {
   val contacts = listOf(
        Contact("Alice Johnson", "9876543210", R.drawable.ic_launcher_foreground, "5:30 PM", "2023-10-15"),
        Contact("Bob Williams", "9123456780", R.drawable.ic_launcher_foreground, "6:00 PM", "2023-10-14"),
        Contact("Charlie Brown", "9001234567", R.drawable.ic_launcher_foreground, "7:00 PM", "2023-10-13"),
        Contact("Diana Prince", "9098765432", R.drawable.ic_launcher_foreground, "8:30 PM", "2023-10-12"),
        Contact("Alice Johnson", "9876543210", R.drawable.ic_launcher_foreground, "5:30 PM", "2023-10-15"),
        Contact("Bob Williams", "9123456780", R.drawable.ic_launcher_foreground, "6:00 PM", "2023-10-14"),
        Contact("Charlie Brown", "9001234567", R.drawable.ic_launcher_foreground, "7:00 PM", "2023-10-13"),
        Contact("Diana Prince", "9098765432", R.drawable.ic_launcher_foreground, "8:30 PM", "2023-10-12"),
        Contact("Alice Johnson", "9876543210", R.drawable.ic_launcher_foreground, "5:30 PM", "2023-10-15"),
        Contact("Bob Williams", "9123456780", R.drawable.ic_launcher_foreground, "6:00 PM", "2023-10-14"),
        Contact("Charlie Brown", "9001234567", R.drawable.ic_launcher_foreground, "7:00 PM", "2023-10-13"),
        Contact("Diana Prince", "9098765432", R.drawable.ic_launcher_foreground, "8:30 PM", "2023-10-12"),
        Contact("Alice Johnson", "9876543210", R.drawable.ic_launcher_foreground, "5:30 PM", "2023-10-15"),
        Contact("Bob Williams", "9123456780", R.drawable.ic_launcher_foreground, "6:00 PM", "2023-10-14"),
        Contact("Charlie Brown", "9001234567", R.drawable.ic_launcher_foreground, "7:00 PM", "2023-10-13"),
        Contact("Diana Prince", "9098765432", R.drawable.ic_launcher_foreground, "8:30 PM", "2023-10-12")
    )

}
