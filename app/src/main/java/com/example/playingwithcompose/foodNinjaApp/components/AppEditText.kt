package com.example.playingwithcompose.foodNinjaApp.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.playingwithcompose.R

@Preview(name = "EditText")
@Composable
fun AppEditText(
    hintEditText: String = "test",
    leadingIcon: @Composable (() -> Unit)? = null,
    onValueChange:(String)->Unit ={}
) {
    var value by remember { mutableStateOf("") }
    Row {
        OutlinedTextField(
            value = value,
            onValueChange = {valuee->
                value = valuee
                onValueChange(value)
            },
            shape= RoundedCornerShape(20.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color.Gray.copy(alpha = 0.2f),
                unfocusedBorderColor = Color.Gray.copy(alpha = 0.2f),
            ),
            placeholder = { Text(text = hintEditText) },
            maxLines = 1,
            leadingIcon = leadingIcon,
            singleLine = true
        )
    }

}