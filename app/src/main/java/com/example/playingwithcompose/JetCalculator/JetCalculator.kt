package com.example.playingwithcompose.JetCalculator

import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.playingwithcompose.JetCalculator.views.MainContent
import com.example.playingwithcompose.JetCalculator.views.TopCard
import com.example.playingwithcompose.ui.theme.PlayingWithComposeTheme
import java.lang.reflect.Modifier

class JetCalculator : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContent {
            MyTipCalculatorApp {
                Column {


                    TopCard()
                    MainContent()
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

@Preview
@Composable
fun DefaultPreview() {
    PlayingWithComposeTheme {
        MyTipCalculatorApp {
            Column(modifier = androidx.compose.ui.Modifier.fillMaxHeight().fillMaxWidth()) {
                TopCard()
                MainContent()
            }
        }
    }
}
