package com.example.playingwithcompose.foodNinjaApp.feature.auth.login

import android.util.Log
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import com.example.playingwithcompose.R
import com.example.playingwithcompose.foodNinjaApp.components.AppBoldedTextField
import com.example.playingwithcompose.foodNinjaApp.components.AppButton
import com.example.playingwithcompose.foodNinjaApp.components.AppEditText
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
            modifier = Modifier.size(180.dp, 200.dp)
        )
        AppBoldedTextField(text = "Login to Your Account", modifier = Modifier.padding(60.dp))
        AppEditText(" Email")
        AppEditText("Password")
        AppBoldedTextField(text = "Or Continue With")

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

        AppButton(text = "Login", onButtonClick = {
            Log.e("click","eror,click")
        })



    }
}