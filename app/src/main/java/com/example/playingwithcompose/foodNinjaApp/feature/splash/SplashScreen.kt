package com.example.playingwithcompose.foodNinjaApp.feature.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.playingwithcompose.R
import kotlinx.coroutines.delay

const val Splash_delay = 3000L

@Preview("SplashScreen")
@Composable
fun SplashScreen(onSplashDelayEnd: () -> Unit = {}) {

    LaunchedEffect(true, block = {
        delay(Splash_delay)
        onSplashDelayEnd.invoke()
    })
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painterResource(id = R.drawable.background),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
        )
        Image(
            painterResource(id = R.drawable.food_logo),
            contentDescription = null,
            modifier = Modifier
                .align(Alignment.Center)
                .size(width = 200.dp, height = 200.dp)
        )
    }
}