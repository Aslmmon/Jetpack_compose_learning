package com.example.playingwithcompose

import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithContentDescription
import androidx.navigation.compose.ComposeNavigator
import androidx.navigation.testing.TestNavHostController
import com.example.playingwithcompose.foodNinjaApp.feature.auth.login.SignInScreenDescription
import com.example.playingwithcompose.foodNinjaApp.feature.auth.signUp.SignUpScreenDescription
import com.example.playingwithcompose.foodNinjaApp.feature.splash.SplashScreenDescription
import com.example.playingwithcompose.foodNinjaApp.navigation.NinjaAppNavHost
import kotlinx.coroutines.*
import kotlinx.coroutines.test.StandardTestDispatcher
import kotlinx.coroutines.test.runBlockingTest
import kotlinx.coroutines.test.runTest
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import java.lang.Runnable
import java.util.concurrent.TimeUnit
import kotlin.coroutines.CoroutineContext

class NavigationTest {
    @get:Rule
    val composeTestRule = createComposeRule()

    lateinit var navController: TestNavHostController


    @Before
    fun setUpNingaFoodAppTestNavController() {
        composeTestRule.setContent {
            navController = TestNavHostController(LocalContext.current)
            navController.navigatorProvider.addNavigator(ComposeNavigator())
            NinjaAppNavHost(navController = navController)
        }
    }


    @Test
    fun ninjaAppNavHost_verifySplashScreenStartDestination() {
        composeTestRule
            .onNodeWithContentDescription(SplashScreenDescription)
            .assertIsDisplayed()
    }

    @Test
    fun ninjaAppNavHost_verifySignInScreenOpened() {
        runTest {
                fetchData()
                composeTestRule
                    .onNodeWithContentDescription(SignInScreenDescription)
                    .assertIsDisplayed()
        }
    }

    @Test
    fun ninjaAppNavHost_verifySignUpScreenOpened() {
        composeTestRule
            .onNodeWithContentDescription(SignUpScreenDescription)
            .assertIsDisplayed()
    }

//    @Test
//    fun rallyNavHost_clickAllAccount_navigatesToAccounts() {
//        composeTestRule
//            .onNodeWithContentDescription("All Accounts")
//            .performClick()
//
//        composeTestRule
//            .onNodeWithContentDescription("Accounts Screen")
//            .assertIsDisplayed()
//    }
}

suspend fun fetchData() {
    delay(4000L)
}