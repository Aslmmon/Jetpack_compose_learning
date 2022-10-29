package com.example.playingwithcompose.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.playingwithcompose.R
import com.example.playingwithcompose.ui.theme.PlayingWithComposeTheme


@Composable
fun LoginApp(content: @Composable () -> Unit) {
        Surface(color = MaterialTheme.colors.background) {
            content()
        }

}

@Composable
fun ShowApp(){
    LoginApp {

    }
}
