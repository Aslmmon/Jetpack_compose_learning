package com.example.playingwithcompose.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable



@Composable
fun PlayingWithComposeTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {


    MaterialTheme(
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}