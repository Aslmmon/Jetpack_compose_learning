package com.example.playingwithcompose.foodNinjaApp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.playingwithcompose.foodNinjaApp.components.ShowAppLayoutWithLogo
import com.example.playingwithcompose.foodNinjaApp.extension.removeTopBar
import com.example.playingwithcompose.foodNinjaApp.feature.auth.login.ShowLoginPageContent
import com.example.playingwithcompose.ui.theme.PlayingWithComposeTheme

class NinjaApp : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        removeTopBar()
        setContent {
            PlayingWithComposeTheme {
                ShowAppLayoutWithLogo {
                    ShowLoginPageContent()
                }
            }
        }
    }


}


@Preview(name = "LoginScreen")
@Composable
fun showPreview() {
    ShowAppLayoutWithLogo {
        ShowLoginPageContent()
    }
}
