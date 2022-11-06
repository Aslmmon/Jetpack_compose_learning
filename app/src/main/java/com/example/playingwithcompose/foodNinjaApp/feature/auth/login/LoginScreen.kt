package com.example.playingwithcompose.foodNinjaApp.feature.auth.login

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.util.Log
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.playingwithcompose.R
import com.example.playingwithcompose.foodNinjaApp.components.*
import com.example.playingwithcompose.foodNinjaApp.feature.auth.signUp.SignUpActivity
import com.example.playingwithcompose.ui.theme.AppColorPrimary


@Preview("loginContent")
@Composable
fun ShowLoginPageContent() {
    val context = LocalContext.current

    AppBoldedTextField(text = "Login to Your Account", modifier = Modifier.padding(top = 30.dp))
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
    AppTextUnderlined(text = "Forgot your Password?", onTextClicked = {
        /**
         * navigate to Forget Password
         */
    })

    AppButton(text = "Login", onButtonClick = {
        Log.e("click", "eror,click")
        with(context) {
            startActivity(Intent(this, SignUpActivity::class.java))
            (this as Activity).finish()
        }
    })


}

