package com.example.playingwithcompose.foodNinjaApp.feature.auth.login

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import com.example.playingwithcompose.R
import com.example.playingwithcompose.foodNinjaApp.components.customEditText
import com.example.playingwithcompose.foodNinjaApp.components.socialMediaButtons
import com.example.playingwithcompose.ui.theme.AppColorPrimary


@Composable
 fun showLoginPageContent() {

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