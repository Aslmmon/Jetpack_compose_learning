package com.example.playingwithcompose.foodNinjaApp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.playingwithcompose.R
import com.example.playingwithcompose.ui.theme.AppColorBlack
import com.example.playingwithcompose.ui.theme.AppColorPrimary
import com.example.playingwithcompose.ui.theme.AppColorWhite


@Composable
fun AppBoldedTextField(modifier: Modifier = Modifier, text: String, textSize: Int=18,fontWeight: FontWeight=FontWeight.Bold) {
    return Text(
        text = text,
        fontWeight = fontWeight,
        modifier = modifier,
        fontSize = textSize.sp
    )
}

@Preview
@Composable
fun AppTextWithIcon(
    modifier: Modifier = Modifier,
    title: String = "",
    textColor: Color = AppColorBlack
) {
    return Row(
        horizontalArrangement = Arrangement.Start,
        modifier = modifier
            .fillMaxWidth()
            .padding(10.dp)
    ) {
        Box(
            modifier = Modifier
                .size(25.dp, 25.dp)
                .clip(CircleShape)
                .background(AppColorPrimary), contentAlignment = Alignment.Center
        ) {
            AppImageLoaderSVG(resource = R.drawable.right_icon)
        }
        Spacer(modifier = modifier.padding(horizontal = 5.dp))
        Text(text = title, textAlign = TextAlign.Center, color = textColor)
    }
}

@Composable
fun AppTextUnderlined(
    text: String,
    textColor: Color = AppColorPrimary,
    onTextClicked: () -> Unit = {},
    modifier: Modifier = Modifier
) {
    Text(
        text = text,
        textAlign = TextAlign.Center,
        color = textColor,
        style = TextStyle(textDecoration = TextDecoration.Underline),
        modifier = modifier
            .padding(top = 20.dp)
            .clickable {
                onTextClicked.invoke()
            },

        )
}