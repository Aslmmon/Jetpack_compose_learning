package com.example.playingwithcompose.foodNinjaApp

import android.os.Bundle
import android.view.WindowManager
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.view.WindowCompat
import com.example.playingwithcompose.R
import com.example.playingwithcompose.foodNinjaApp.feature.auth.login.showLoginPageContent
import com.example.playingwithcompose.ui.theme.PlayingWithComposeTheme

class NinjaApp : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )
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
    Box {
        Image(
            painterResource(id = R.drawable.background),
            contentDescription = "test",
            modifier = Modifier.fillMaxSize()
        )
        showLoginPageContent()

    }
}
