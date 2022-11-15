package com.example.playingwithcompose.foodNinjaApp.navigation

/*
 * Copyright 2022 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


/**
 * Contract for information needed on every Rally navigation destination
 */
interface NinjaAppDestination {
    val route: String
}

/**
 * Rally app navigation destinations
 */
object SplashScreen : NinjaAppDestination {
    override val route = "splashScreen"
}

object SignInScreen : NinjaAppDestination {
    override val route = "signInScreen"
}

object SignUpScreen : NinjaAppDestination {
    override val route = "signUpScreen"
}

object ProfileBioScreen : NinjaAppDestination {
    override val route = "profileBioScreen"
}
object ProfileImageScreen : NinjaAppDestination {
    override val route = "profileImageScreen"
}

/**
 * for argument destination
 */
//object SingleAccount : NinjaAppDestination {
//    // Added for simplicity, this icon will not in fact be used, as SingleAccount isn't
//    // part of the RallyTabRow selection
//    override val route = "single_account"
//    const val accountTypeArg = "account_type"
//    val routeWithArgs = "$route/{$accountTypeArg}"
//    val arguments = listOf(
//        navArgument(accountTypeArg) { type = NavType.StringType }
//    )
//    val deepLinks = listOf(
//        navDeepLink { uriPattern = "rally://$route/{$accountTypeArg}" }
//    )
//}

