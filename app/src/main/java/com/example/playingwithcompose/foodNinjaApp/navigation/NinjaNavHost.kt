package com.example.playingwithcompose.foodNinjaApp.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.playingwithcompose.foodNinjaApp.feature.auth.login.SignInPageScreen
import com.example.playingwithcompose.foodNinjaApp.feature.auth.signUp.SignUpPageScreen

@Composable
fun NinjaAppNavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = SignInScreen.route,
        modifier = modifier
    ) {
        composable(route = SignInScreen.route) {
            SignInPageScreen(onSignInClick = {

                /**
                 * Todo
                 */
            }, onForgetPasswordClick = {
                /**
                 * Todo
                 */
            }, onSignUpClick = {
            navController.navigate(SignUpScreen.route)
            })
        }
        composable(route = SignUpScreen.route) {
            SignUpPageScreen()
        }

//        composable(
//            route = SingleAccount.routeWithArgs,
//            arguments = SingleAccount.arguments,
//            deepLinks = SingleAccount.deepLinks
//        ) { navBackStackEntry ->
//            val accountType =
//                navBackStackEntry.arguments?.getString(SingleAccount.accountTypeArg)
//            SingleAccountScreen(accountType)
//        }
    }
}

fun NavHostController.navigateSingleTopTo(route: String) =
    this.navigate(route) { launchSingleTop = true }

private fun NavHostController.navigateToSingleAccount(accountType: String) {
   // this.navigateSingleTopTo("${SingleAccount.route}/$accountType")
}