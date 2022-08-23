package com.example.playingwithcompose.BiznessCardApp

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Green
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
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
    val buttonState = remember {
        mutableStateOf(false)
    }
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
                createImageProfileCard(
                    Modifier
                        .size(150.dp)
                        .padding(5.dp))
                provideDevider()
                createStaticDataForUser()
                Button(onClick = {
                    Log.i("data", "clicked")
                    buttonState.value = !buttonState.value
                }) {
                    Text(text = "Portfolio", style = MaterialTheme.typography.button)
                }
                when(buttonState.value){
                    true -> createContent()
                    false -> Box(modifier = Modifier.padding(5.dp))
                }

            }


        }

    }
}

//
@Composable
private fun createContent() {
    Box(
        modifier = Modifier
            .fillMaxWidth()

            .fillMaxHeight()
            .padding(5.dp)
    ) {
        Surface(
            modifier = Modifier
                .padding(3.dp)
                .fillMaxHeight()
                .fillMaxWidth(),
            shape = RoundedCornerShape(corner = CornerSize(5.dp))
        ) {
            Portfolio(mutableListOf("First Project", "Second One", "third One"))
        }
    }
}

@Composable
fun Portfolio(dataList: MutableList<String>) {
    LazyColumn() {
        items(dataList) { item ->
            Card(modifier = Modifier
                .padding(13.dp)
                .fillMaxWidth(), shape = RectangleShape) {
                    Row(modifier = Modifier
                        .padding(8.dp)
                        .background(MaterialTheme.colors.surface)
                        .padding(8.dp)) {
                            createImageProfileCard(
                                Modifier
                                    .size(50.dp)
                                    .padding(5.dp))

                            Column(modifier = Modifier
                                .align(Alignment.CenterVertically)) {
                                Text(text = item, fontWeight = FontWeight.Bold)
                                Text(text = item, style = MaterialTheme.typography.body2)

                            }

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
        color = Color.Gray
    )
}

@Composable
fun createImageProfileCard(modifier: Modifier) {
    Surface(
        modifier = modifier,
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

