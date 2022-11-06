package com.example.playingwithcompose.foodNinjaApp.extension

import android.app.Activity
import android.view.WindowManager
import androidx.core.view.WindowCompat

fun Activity.removeTopBar(){
    WindowCompat.setDecorFitsSystemWindows(window, false)
    this.window.setFlags(
        WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
        WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
    )
}