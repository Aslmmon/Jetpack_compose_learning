package com.example.playingwithcompose.foodNinjaApp.extension

import android.app.Activity
import android.content.Context
import android.view.WindowManager
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.core.view.WindowCompat

fun Activity.removeTopBar(){
    WindowCompat.setDecorFitsSystemWindows(window, false)
    this.window.setFlags(
        WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
        WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
    )
}

@Composable
fun Composable.getComposableContext(): Context {
    return LocalContext.current
}