package com.example.playingwithcompose.foodNinjaApp.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource

@Composable
fun AppImageLoaderSVG(
    modifier: Modifier=Modifier,
    resource: Int,
    onImageclick: () -> Unit = {}
) {
    return Image(imageVector = ImageVector.vectorResource(id = resource),
        contentDescription = "",
        modifier= modifier.clickable { onImageclick.invoke() })
}