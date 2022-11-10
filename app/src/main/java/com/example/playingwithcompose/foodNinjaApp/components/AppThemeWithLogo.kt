package com.example.playingwithcompose.foodNinjaApp.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.playingwithcompose.R


@Preview("appThemeWithLogo")
@Composable
fun ShowAppLayoutWithLogo(
    modifier: Modifier=Modifier,
    content: @Composable () -> Unit ={}
) {
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painterResource(id = R.drawable.background),
            contentDescription = "test",
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
        )
        Column ( horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .navigationBarsPadding().imePadding()
                .verticalScroll(rememberScrollState())
                .padding(top = 20.dp)){
            Image(
                painterResource(id = R.drawable.food_logo),
                contentDescription = "logo",
                modifier = Modifier.size(180.dp, 200.dp)
            )
            content.invoke()
        }
    }
}