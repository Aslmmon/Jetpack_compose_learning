package com.example.playingwithcompose.foodNinjaApp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.playingwithcompose.R
import com.example.playingwithcompose.foodNinjaApp.extension.removeTopBar
import com.example.playingwithcompose.foodNinjaApp.feature.auth.login.showLoginPageContent
import com.example.playingwithcompose.ui.theme.PlayingWithComposeTheme

class NinjaApp : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        removeTopBar()
        setContent {
            PlayingWithComposeTheme {
                Box {
                    Image(
                        painterResource(id = R.drawable.background),
                        contentDescription = "test",
                        modifier = Modifier.fillMaxSize()
                    )
                    Box {
                        showLoginPageContent()
                    }
                }
            }
        }
    }


}


@Preview(name = "LoginScreen")
@Composable
fun showPreview() {

    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painterResource(id = R.drawable.background),
            contentDescription = "test",
            modifier = Modifier.fillMaxWidth().fillMaxHeight()
        )
        Box {
            showLoginPageContent()
        }
    }
}
