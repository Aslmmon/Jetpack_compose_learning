package com.example.playingwithcompose.JetCalculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import com.example.playingwithcompose.JetCalculator.views.MainContent
import com.example.playingwithcompose.JetCalculator.views.TopCard
import com.example.playingwithcompose.ui.theme.PlayingWithComposeTheme

class JetCalculator : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PlayingWithComposeTheme {
                MyTipCalculatorApp {
                    Column(
                        modifier = androidx.compose.ui.Modifier
                            .fillMaxHeight()
                            .fillMaxWidth()
                    ) {
                        TopCard()
                        MainContent()
                    }
                }
            }
        }
    }
}

@Composable
fun MyTipCalculatorApp(content: @Composable () -> Unit) {
    PlayingWithComposeTheme {
        Surface(color = MaterialTheme.colors.background) {
            content()
        }

    }
}

