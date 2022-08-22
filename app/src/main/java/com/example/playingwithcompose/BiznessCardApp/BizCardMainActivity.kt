package com.example.playingwithcompose.BiznessCardApp

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Green
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.playingwithcompose.R
import com.example.playingwithcompose.ui.theme.PlayingWithComposeTheme

class BizCardMainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContent {
            PlayingWithComposeTheme {
                Surface(
                    color = MaterialTheme.colors.background,
                ) {
                    CreateBizCard()
                }
            }

        }
    }
}

@Composable
fun CreateBizCard() {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
    ) {
        Card(
            modifier = Modifier
                .width(200.dp)
                .height(390.dp)
                .padding(10.dp), elevation = 20.dp,
            shape = RoundedCornerShape(corner = CornerSize(15.dp)),
            backgroundColor = Color.White
        ) {
            Column(

                modifier = Modifier.height(300.dp),
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                createImageProfileCard()
                provideDevider()
                createStaticDataForUser()
                Button(onClick = {
                    Log.i("data","clicked")
                }) {
                    Text(text = "Portfolio", style = MaterialTheme.typography.button)
                }

            }

        }

    }
}

@Composable
private fun createStaticDataForUser() {
    Column(modifier = Modifier.padding(5.dp)) {
        Text(
            text = "Miles P.", style = MaterialTheme.typography.h4,
            color = MaterialTheme.colors.primaryVariant
        )
        Text(
            text = "Android Programmer",
        )
        Text(
            text = "@testCompose", style = MaterialTheme.typography.subtitle1,
        )


    }
}

@Composable
private fun provideDevider() {
    Divider(
        modifier = Modifier.height(1.dp),
        thickness = 1.dp,
        color = Color.Blue
    )
}

@Composable
fun createImageProfileCard() {
    Surface(
        modifier = Modifier
            .size(150.dp)
            .padding(5.dp),
        shape = CircleShape,
        border = BorderStroke(0.1.dp, Color.LightGray),
        elevation = 2.dp,
        color = MaterialTheme.colors.onSurface.copy(alpha = 0.1f)
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_foreground),
            contentDescription = "profileImage",
            modifier = Modifier.size(10.dp),
            contentScale = ContentScale.Crop
        )

    }
}

@Preview
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    PlayingWithComposeTheme {
        CreateBizCard()
    }
}

