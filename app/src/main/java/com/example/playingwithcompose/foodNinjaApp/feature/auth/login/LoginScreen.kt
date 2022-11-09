package com.example.playingwithcompose.foodNinjaApp.feature.auth.login

import android.util.Log
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.playingwithcompose.R
import com.example.playingwithcompose.foodNinjaApp.components.*


const val SignInScreenDescription = "SignInScreenDescription"

@Preview("loginContent")
@Composable
fun SignInPageScreen(
    onSignInClick: () -> Unit = {},
    onForgetPasswordClick: () -> Unit = {},
    onSignUpClick: () -> Unit = {},
    loginViewModel: LoginViewModel = viewModel()
) {

    val loginUiState by loginViewModel.uiState.collectAsState()
    LaunchedEffect(key1 = true, block ={
        Log.e("error",loginUiState.email)
        Log.e("error",loginUiState.password)

    })

    ShowAppLayoutWithLogo() {
        AppBoldedTextField(text = "Login to Your Account", modifier = Modifier.padding(top = 30.dp))
        AppEditText(" Email", onValueChange = loginViewModel::setEmail)
        AppEditText("Password", onValueChange = loginViewModel::setPassword)
        AppBoldedTextField(text = "Or Continue With")
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp)
                .semantics { contentDescription = SignInScreenDescription },
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            socialMediaButtons(R.drawable.facebook_icon, "Facebook")
            socialMediaButtons(R.drawable.google_icons, "Google")

        }
        AppTextUnderlined(text = "Forgot your Password?", onTextClicked = onForgetPasswordClick)
        AppButton(text = "Login", onButtonClick = onSignInClick)
        AppButton(text = "Sign Up", onButtonClick = onSignUpClick)


    }


}

