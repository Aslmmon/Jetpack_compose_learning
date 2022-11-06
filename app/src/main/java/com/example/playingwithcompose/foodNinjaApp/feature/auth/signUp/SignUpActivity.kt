package com.example.playingwithcompose.foodNinjaApp.feature.auth.signUp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.playingwithcompose.R
import com.example.playingwithcompose.foodNinjaApp.components.*
import com.example.playingwithcompose.foodNinjaApp.extension.removeTopBar
import com.example.playingwithcompose.ui.theme.PlayingWithComposeTheme

class SignUpActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        removeTopBar()
        setContent {
            PlayingWithComposeTheme() {
                ShowAppLayoutWithLogo {
                    AppBoldedTextField(text = "Sign up For Free ",
                        modifier = Modifier.padding(top = 60.dp, bottom = 20.dp))

                    AppEditText(hintEditText = "Amsdsd", leadingIcon = {                AppImageLoaderSVG(resource = R.drawable.lock)
                        AppImageLoaderSVG(resource = R.drawable.profile)
                    })
                    AppEditText(hintEditText = "Email", leadingIcon = {
                        AppImageLoaderSVG(resource = R.drawable.message)
                    })
                    AppEditText(hintEditText = "Password", leadingIcon = {
                        AppImageLoaderSVG(resource = R.drawable.lock)
                    })
                    AppTextWithIcon(title="Keep Me Signed In")
                    AppTextWithIcon(title="Email Me About Special Pricing")
                    AppButton(text = "Create Account", onButtonClick = {

                    })
                    AppTextUnderlined("Already have an account?", onTextClicked = {

                    })                }
            }

        }
    }
}

@Preview(name = "SignUpScreen")
@Composable
fun ShowSignUp() {
    ShowAppLayoutWithLogo {
        AppBoldedTextField(text = "Sign up For Free ",
            modifier = Modifier.padding(top = 30.dp, bottom = 20.dp))

        AppEditText(hintEditText = "Amsdsd", leadingIcon = {                AppImageLoaderSVG(resource = R.drawable.lock)
            AppImageLoaderSVG(resource = R.drawable.profile)
        })
        AppEditText(hintEditText = "Email", leadingIcon = {
            AppImageLoaderSVG(resource = R.drawable.message)


        })
        AppEditText(hintEditText = "Password", leadingIcon = {
            AppImageLoaderSVG(resource = R.drawable.lock)
        })
        AppTextWithIcon(title="Keep Me Signed In")
        AppTextWithIcon(title="Email Me About Special Pricing")
        AppButton(text = "Create Account", onButtonClick = {

        })
        AppTextUnderlined("Already have an account?", onTextClicked = {

        })
    }
}