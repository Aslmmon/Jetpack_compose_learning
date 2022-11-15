package com.example.playingwithcompose.foodNinjaApp.feature.auth.signUpProcess

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Colors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.playingwithcompose.R
import com.example.playingwithcompose.foodNinjaApp.components.AppBoldedTextField
import com.example.playingwithcompose.foodNinjaApp.components.AppButton
import com.example.playingwithcompose.foodNinjaApp.components.AppEditText
import com.example.playingwithcompose.foodNinjaApp.components.AppImageLoaderSVG

@Preview("profileBioScreen")
@Composable
fun ShowProfileBioScreen(
    modifier: Modifier = Modifier,
    onNextButtonClicked: () -> Unit = {},
    onBackButtonClicked: () -> Unit = {}
) {

    Box(
        modifier = modifier
            .background(color = Color.White)
            .fillMaxSize()
    ) {
        Column(
            verticalArrangement = Arrangement.SpaceBetween, modifier = modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Column(modifier = modifier.padding(horizontal = 10.dp, vertical = 10.dp)) {
                Spacer(modifier = modifier.height(20.dp))
                AppImageLoaderSVG(
                    resource = R.drawable.icon_back,
                    onImageclick = onBackButtonClicked
                )
                Spacer(modifier = modifier.height(20.dp))

                AppBoldedTextField(
                    modifier = modifier.padding(10.dp),
                    text = stringResource(id = R.string.bio_title), textSize = 32
                )
                Spacer(modifier = modifier.height(25.dp))
                AppBoldedTextField(
                    modifier = modifier.padding(10.dp),
                    text = stringResource(id = R.string.bio_description),
                    fontWeight = FontWeight.Normal
                )
                Spacer(modifier = modifier.height(10.dp))
                AppEditText(hintEditText = stringResource(id = R.string.firstName))
                Spacer(modifier = modifier.height(10.dp))
                AppEditText(hintEditText = stringResource(id = R.string.lastName))
                Spacer(modifier = modifier.height(10.dp))
                AppEditText(hintEditText = stringResource(id = R.string.mobileNumber))

            }
            AppButton(
                text = stringResource(id = R.string.next_title),
                onButtonClick = onNextButtonClicked,
                modifier = modifier.padding(bottom = 25.dp)
            )
        }
    }

}