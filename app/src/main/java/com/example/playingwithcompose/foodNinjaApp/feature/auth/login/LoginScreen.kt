package com.example.playingwithcompose.foodNinjaApp.feature.auth.login

import android.util.Log
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.playingwithcompose.R
import com.example.playingwithcompose.foodNinjaApp.components.*


const val SignInScreenDescription = "SignInScreenDescription"

@Preview("loginContent")
@Composable
fun SignInPageScreen(
    onSignInClick: () -> Unit = {},
    onForgetPasswordClick: () -> Unit = {},
    onSignUpClick: () -> Unit = {},
    loginViewModel: LoginViewModel = hiltViewModel()
) {


    val loginUiState by loginViewModel.uiState.collectAsState()

    LaunchedEffect(key1 = true, block = {
        loginViewModel.clearState()
    })
    ShowAppLayoutWithLogo {
        AppBoldedTextField(
            text = stringResource(id = R.string.login_to_your_account),
            modifier = Modifier.padding(top = 30.dp)
        )
        AppEditText(
            stringResource(id = R.string.email_text),
            onValueChange = loginViewModel::setEmail
        )
        AppEditText(
            stringResource(id = R.string.password_text),
            onValueChange = loginViewModel::setPassword
        )
        AppBoldedTextField(text = stringResource(id = R.string.or_continue_with))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp)
                .semantics { contentDescription = SignInScreenDescription },
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            socialMediaButtons(
                R.drawable.facebook_icon,
                stringResource(id = R.string.facebook_title)
            )
            socialMediaButtons(R.drawable.google_icons, stringResource(id = R.string.google_title))

        }
        AppTextUnderlined(
            text = stringResource(id = R.string.forget_password_title),
            onTextClicked = onForgetPasswordClick
        )
        AppButton(text = stringResource(id = R.string.login_title), onButtonClick = {

        }, isButtonValid = loginUiState.isValid)
        AppButton(text = stringResource(id = R.string.signUp_title), onButtonClick = onSignUpClick)


    }


}

