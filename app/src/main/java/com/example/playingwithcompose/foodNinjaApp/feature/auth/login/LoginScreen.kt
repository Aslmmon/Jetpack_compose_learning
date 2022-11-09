package com.example.playingwithcompose.foodNinjaApp.feature.auth.login

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.playingwithcompose.R
import com.example.playingwithcompose.foodNinjaApp.components.*


@Preview("loginContent")
@Composable
fun SignInPageScreen(onSignInClick: () -> Unit = {},
                     onForgetPasswordClick: () -> Unit = {},
) {

    ShowAppLayoutWithLogo{
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
        AppTextUnderlined(text = "Forgot your Password?", onTextClicked = onForgetPasswordClick)
        AppButton(text = "Login", onButtonClick = onSignInClick)

    }


}

