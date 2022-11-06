package com.example.playingwithcompose.foodNinjaApp.feature.auth.login

import android.util.Log
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.playingwithcompose.R
import com.example.playingwithcompose.foodNinjaApp.components.AppBoldedTextField
import com.example.playingwithcompose.foodNinjaApp.components.AppButton
import com.example.playingwithcompose.foodNinjaApp.components.AppEditText
import com.example.playingwithcompose.foodNinjaApp.components.socialMediaButtons
import com.example.playingwithcompose.ui.theme.AppColorPrimary


@Preview("loginContent")
@Composable
 fun ShowLoginPageContent() {
    AppBoldedTextField(text = "Login to Your Account", modifier = Modifier.padding(top = 60.dp))
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
        Log.e("click", "eror,click")
    })


}