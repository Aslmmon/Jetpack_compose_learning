package com.example.playingwithcompose.foodNinjaApp.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.playingwithcompose.ui.theme.AppColorPrimary
import com.example.playingwithcompose.ui.theme.AppColorWhite


@Preview(name = "AppButton")
@Composable
fun AppButton(
    modifier: Modifier = Modifier,
    text: String,
    backgroundColor: Color = AppColorPrimary,
    textColor: Color = AppColorWhite,
    onButtonClick: () -> Unit,
) {
    Button(
        onClick = onButtonClick,
        colors = ButtonDefaults.buttonColors(backgroundColor = backgroundColor),
        modifier = modifier
            .padding(top = 20.dp)
            .border(
                border = BorderStroke(0.5.dp, color = Color.White.copy(alpha = 0.2f)),
                shape = RoundedCornerShape(10.dp)
            )
    )

    {
        Text(text = text, color = textColor)
    }
}