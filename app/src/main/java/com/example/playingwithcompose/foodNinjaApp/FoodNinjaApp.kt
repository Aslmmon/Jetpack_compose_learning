package com.example.playingwithcompose.foodNinjaApp

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.playingwithcompose.foodNinjaApp.components.ShowAppLayoutWithLogo
import com.example.playingwithcompose.foodNinjaApp.extension.removeTopBar
import com.example.playingwithcompose.foodNinjaApp.feature.auth.login.SignInPageScreen
import com.example.playingwithcompose.foodNinjaApp.navigation.NinjaAppNavHost
import com.example.playingwithcompose.ui.theme.PlayingWithComposeTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FoodNinjaApp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        removeTopBar()
        setContent {
            PlayingWithComposeTheme {
                val navigationController by rememberUpdatedState(newValue = rememberNavController())
                val navController = rememberNavController()
                NinjaAppNavHost(
                    navController = navigationController,
                    modifier = Modifier
                )
            }
        }
    }


}


@Preview(name = "LoginScreen")
@Composable
fun showPreview() {
    ShowAppLayoutWithLogo {
        SignInPageScreen()
    }
}
