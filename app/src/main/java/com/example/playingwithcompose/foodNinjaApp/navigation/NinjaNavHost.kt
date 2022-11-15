package com.example.playingwithcompose.foodNinjaApp.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.playingwithcompose.foodNinjaApp.feature.auth.login.LoginViewModel
import com.example.playingwithcompose.foodNinjaApp.feature.auth.login.SignInPageScreen
import com.example.playingwithcompose.foodNinjaApp.feature.auth.signUp.SignUpPageScreen
import com.example.playingwithcompose.foodNinjaApp.feature.auth.signUpProcess.ShowProfileBioScreen
import com.example.playingwithcompose.foodNinjaApp.feature.splash.SplashScreen

@Composable
fun NinjaAppNavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = SplashScreen.route,
        modifier = modifier
    ) {
        composable(route = SignInScreen.route) {

            SignInPageScreen(onSignInClick = {
            }, onForgetPasswordClick = {
            }, onSignUpClick = {
                navController.navigate(SignUpScreen.route)
            })
        }
        composable(route = SignUpScreen.route) {
            SignUpPageScreen(onCreateAccountClick = {
                navController.navigate(ProfileBioScreen.route)
            })
        }
        composable(route=ProfileBioScreen.route){
            ShowProfileBioScreen(onNextButtonClicked = {
                navController.navigate(ProfileImageScreen.route)
            }, onBackButtonClicked = {
                navController.popBackStack()
            })
        }
        composable(route=ProfileImageScreen.route){

        }
        composable(route = SplashScreen.route) {
            SplashScreen(onSplashDelayEnd = {
                navController.navigate(SignInScreen.route) {
                    popUpTo(SplashScreen.route) {
                        inclusive = true
                    }
                }
            })
        }
    }
}

fun NavHostController.navigateSingleTopTo(route: String) =
    this.navigate(route) { launchSingleTop = true }

private fun NavHostController.navigateToSingleAccount(accountType: String) {
    // this.navigateSingleTopTo("${SingleAccount.route}/$accountType")
}