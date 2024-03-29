package com.example.playingwithcompose.foodNinjaApp.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.playingwithcompose.R

@Preview(name = "EditText")
@Composable
fun AppEditText(
    hintEditText: String = "",
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
            placeholder = { Text(text = hintEditText) },
            maxLines = 1,
            leadingIcon = leadingIcon,
            singleLine = true
        )
    }

}