package com.example.playingwithcompose.NotesApp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.playingwithcompose.NotesApp.onboarding.OnboardingScreen
import com.example.playingwithcompose.NotesApp.ui.theme.PlayingWithComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PlayingWithComposeTheme {
                NotesApp(modifier = Modifier.fillMaxSize())
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    val expanded = remember { mutableStateOf(false) }
    val extraPadding = if (expanded.value) 34.dp else 0.dp

    Surface(color = MaterialTheme.colorScheme.primary,
        modifier = modifier
            .padding(vertical = 4.dp, horizontal = 8.dp)) {
        Row (modifier=modifier.padding(18.dp)){
            Column(modifier = modifier.weight(1f).padding(extraPadding)) {
                Text(text = "Hello ")
                Text(text = name)
            }
            ElevatedButton(
                onClick = {
                    expanded.value = !expanded.value
                }
            ) {
                Text(if (expanded.value) "Show less" else "Show more")
            }
        }
    }

}


@Composable
fun NotesApp(
    modifier: Modifier, names: List<String> = listOf("World", "Compose")
) {
    var shouldShowOnboarding by remember { mutableStateOf(true) }

    Surface(modifier) {
        if (shouldShowOnboarding) {
            OnboardingScreen(onContinueClicked = {
                shouldShowOnboarding = false
            })
        } else {
            Column(modifier = modifier.padding(vertical = 4.dp)) {
                for (name in names) {
                    Greeting(name = name)
                }
            }
        }
    }

}

@Preview(showBackground = true, widthDp = 320)
@Composable
fun GreetingPreview() {
    PlayingWithComposeTheme {
        NotesApp(modifier = Modifier.fillMaxSize())
    }
}

