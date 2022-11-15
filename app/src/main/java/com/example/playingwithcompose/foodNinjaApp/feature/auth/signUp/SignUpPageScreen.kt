package com.example.playingwithcompose.foodNinjaApp.feature.auth.signUp

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.playingwithcompose.R
import com.example.playingwithcompose.foodNinjaApp.components.*
import com.example.playingwithcompose.foodNinjaApp.navigation.SignUpScreen

const val SignUpScreenDescription = "SignUpScreenDesscription"

@Preview
@Composable
fun SignUpPageScreen(onCreateAccountClick:()->Unit ={}) {
    ShowAppLayoutWithLogo(modifier = Modifier.semantics {
        contentDescription =
            SignUpScreenDescription
    }) {
        AppBoldedTextField(
            text = "Sign up For Free ",
            modifier = Modifier.padding(top = 60.dp, bottom = 20.dp)
        )
        AppEditText(hintEditText = "Email", leadingIcon = {
            AppImageLoaderSVG(resource = R.drawable.message)
        })
        AppEditText(hintEditText = "Password", leadingIcon = {
            AppImageLoaderSVG(resource = R.drawable.lock)
        })
        AppTextWithIcon(title = "Keep Me Signed In")
        AppTextWithIcon(title = "Email Me About Special Pricing")
        AppButton(text = "Create Account", onButtonClick = onCreateAccountClick)
        AppTextUnderlined("Already have an account?", onTextClicked = {

        })
    }
}

