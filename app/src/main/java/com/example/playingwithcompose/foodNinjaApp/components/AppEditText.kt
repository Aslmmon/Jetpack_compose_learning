package com.example.playingwithcompose.foodNinjaApp.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
 fun AppEditText(hintEditText: String): String {
    val value by remember { mutableStateOf("") }
    OutlinedTextField(
        value = value,
        onValueChange = {

        },
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = Color.Gray.copy(alpha = 0.2f),
            unfocusedBorderColor = Color.Gray.copy(alpha = 0.2f),
        ),
        placeholder = { Text(text = hintEditText) },
        maxLines = 1,
        singleLine = true
    )

    return value
}