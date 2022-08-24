package com.example.playingwithcompose.JetCalculator.views

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun MainContent() {
    Surface(
        modifier = Modifier.padding(10.dp).fillMaxWidth().fillMaxHeight(),
        shape = RoundedCornerShape(corner = CornerSize(5.dp)),
        border = BorderStroke(2.dp, color = Color.LightGray),
    ) {

    }
}