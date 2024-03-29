package com.example.playingwithcompose.NotesApp

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.spring
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
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
    var expanded by rememberSaveable { mutableStateOf(false) }

    val extraPadding by animateDpAsState(
        targetValue = if (expanded) 48.dp else 0.dp,
        animationSpec = spring(
            dampingRatio = Spring.DampingRatioHighBouncy,
            stiffness = Spring.StiffnessLow
        )
    )
    Surface(
        color = MaterialTheme.colorScheme.primary,
        modifier = modifier
            .padding(vertical = 4.dp, horizontal = 8.dp)
    ) {
        Row(modifier = modifier.padding(18.dp)) {
            Column(
                modifier = modifier
                    .weight(1f)
                    .padding(bottom = extraPadding.coerceAtLeast(0.dp))
            ) {
                Text(text = "Hello ")
                Text(text = name)
            }
            ElevatedButton(
                onClick = {
                    expanded = !expanded
                }
            ) {
                Text(if (expanded) "Show less" else "Show more")
            }
        }
    }

}


@Composable
fun NotesApp(
    modifier: Modifier, names: List<String> = List(1000) { "$it" }

) {
    var shouldShowOnboarding by rememberSaveable { mutableStateOf(true) }

    Surface(modifier) {
        if (shouldShowOnboarding) {
            OnboardingScreen(onContinueClicked = {
                shouldShowOnboarding = false
            })
        } else {
            Greetings(modifier = modifier, names)
        }
    }

}

@Composable
fun Greetings(modifier: Modifier, names: List<String>) {
    LazyColumn(modifier = modifier.padding(vertical = 4.dp)) {
        items(names) { name ->
            Greeting(name = name)
        }
    }
}

@Preview(
    showBackground = true, widthDp = 320, heightDp = 620,
    uiMode = Configuration.UI_MODE_NIGHT_NO
)
@Composable
fun NotesAppPreview() {
    PlayingWithComposeTheme {
        NotesApp(modifier = Modifier.fillMaxSize())
    }
}

