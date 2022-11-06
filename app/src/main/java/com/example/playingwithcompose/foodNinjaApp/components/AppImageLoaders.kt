package com.example.playingwithcompose.foodNinjaApp.components

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource

@Composable
fun AppImageLoaderSVG(resource:Int){
    return Image(imageVector = ImageVector.vectorResource(id = resource), contentDescription ="" )
}