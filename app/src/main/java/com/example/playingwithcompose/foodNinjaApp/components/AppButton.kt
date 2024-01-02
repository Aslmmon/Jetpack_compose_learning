package com.example.playingwithcompose.foodNinjaApp.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.playingwithcompose.foodNinjaApp.feature.auth.login.LoginUiState
import com.example.playingwithcompose.ui.theme.AppColorPrimary
import com.example.playingwithcompose.ui.theme.AppColorWhite


@Preview(name = "AppButton")
@Composable
fun AppButton(
    modifier: Modifier = Modifier.fillMaxWidth().padding(horizontal = 20.dp),
    text: String="",
    backgroundColor: Color = AppColorPrimary,
    textColor: Color = AppColorWhite,
    onButtonClick: () -> Unit={},
    isButtonValid:Boolean=true,

) {
    Button(
        onClick = onButtonClick,
        modifier = modifier
            .padding(top = 20.dp).
            size(height = 57.dp, width = 175.dp),
        shape = RoundedCornerShape(15.dp), // = 50% percent
        colors = ButtonDefaults.buttonColors(),
        enabled = isButtonValid

    )

    {
        Text(text = text, color = textColor)
    }
}

