package com.example.playingwithcompose.BiznessCardApp

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.playingwithcompose.R
import com.example.playingwithcompose.ui.theme.PlayingWithComposeTheme

class BizCardMainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContent {
            PlayingWithComposeTheme {
                Surface(
                    color = MaterialTheme.colorScheme.background,
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
                .padding(10.dp),
            shape = RoundedCornerShape(corner = CornerSize(15.dp)),
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
                    Text(text = "Portfolio", style = MaterialTheme.typography.bodyLarge)
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
                        .background(MaterialTheme.colorScheme.surface)
                        .padding(8.dp)) {
                            createImageProfileCard(
                                Modifier
                                    .size(50.dp)
                                    .padding(5.dp))

                            Column(modifier = Modifier
                                .align(Alignment.CenterVertically)) {
                                Text(text = item, fontWeight = FontWeight.Bold)
                                Text(text = item, style = MaterialTheme.typography.bodyLarge)

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
            text = "Miles P.", style = MaterialTheme.typography.bodyLarge,
            color = MaterialTheme.colorScheme.primary
        )
        Text(
            text = "Android Programmer",
        )
        Text(
            text = "@testCompose", style = MaterialTheme.typography.bodyLarge,
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
        color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.1f)
    ) {
        Image(
            painter = painterResource(id = R.drawable.profile),
            contentDescription = "profileImage",
            modifier = Modifier.size(10.dp),
            contentScale = ContentScale.Crop
        )

    }
}


