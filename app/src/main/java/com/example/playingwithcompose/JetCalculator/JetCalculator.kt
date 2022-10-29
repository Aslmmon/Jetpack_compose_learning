package com.example.playingwithcompose.JetCalculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.playingwithcompose.R
import com.example.playingwithcompose.login.LoginApp
import com.example.playingwithcompose.ui.theme.AppColorPrimary
import com.example.playingwithcompose.ui.theme.PlayingWithComposeTheme

class JetCalculator : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PlayingWithComposeTheme {
                LoginApp {

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


}

@Composable
private fun showLoginPageContent() {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(top = 20.dp)
    ) {

        Image(
            painterResource(id = R.drawable.food_logo),
            contentDescription = "logo",
            modifier = Modifier
                .size(180.dp, 200.dp)
        )
        Text(
            text = "Login to Your Account",
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 60.dp)
        )

        customEditText(" Email")
        customEditText("Password")


        Text(text = " Or Continue with ", fontWeight = FontWeight.Bold)

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            socialMediaButtons(R.drawable.facebook_icon, "Facebook")
            socialMediaButtons(R.drawable.google_icons, "Google")

        }
        Text(
            text = "Forgot your Password?",
            textAlign = TextAlign.Center,
            color = AppColorPrimary,
            style = TextStyle(textDecoration = TextDecoration.Underline),
            modifier = Modifier.padding(top = 20.dp),
        )

        Button(
            onClick = {
                //your onclick code
            },
            colors = ButtonDefaults.buttonColors(backgroundColor = AppColorPrimary),
            modifier = Modifier
                .padding(top = 20.dp)
                .border(
                    border = BorderStroke(0.5.dp, color = Color.White.copy(alpha = 0.2f)),
                    shape = RoundedCornerShape(10.dp)
                )
        )

        {
            Text(text = "Login", color = Color.White)
        }

    }
}

@Composable
private fun customEditText(hintEditTexr: String): String {
    val value by remember { mutableStateOf("") }
    OutlinedTextField(
        value = value,
        onValueChange = {

        },
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = Color.Gray.copy(alpha = 0.2f),
            unfocusedBorderColor = Color.Gray.copy(alpha = 0.2f),
        ),
        placeholder = { Text(text = hintEditTexr) },
        maxLines = 1,
        singleLine = true
    )

    return value
}

@Composable
fun socialMediaButtons(image: Int, facebookTitle: String) {

    ApplyBorderline {
        Row {
            Image(
                painterResource(id = image),
                contentDescription = null,
                modifier = Modifier.size(50.dp, 25.dp)
            )
            Text(
                text = facebookTitle,
                textAlign = TextAlign.Center,
                color = Color.Black,
                fontWeight = FontWeight.Bold,

                modifier = Modifier.padding(4.dp),
            )
        }

    }


}


@Composable
fun ApplyBorderline(composeable: @Composable () -> Unit) {
    Box(
        modifier = Modifier
            .border(
                border = BorderStroke(0.5.dp, color = Color.Gray.copy(alpha = 0.2f)),
                shape = RoundedCornerShape(10.dp)
            )
            .padding(10.dp)
    ) {
        composeable.invoke()
    }
}

@Preview
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
