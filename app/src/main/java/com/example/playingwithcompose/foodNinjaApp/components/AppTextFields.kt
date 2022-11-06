package com.example.playingwithcompose.foodNinjaApp.components

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight


@Composable
fun AppBoldedTextField(modifier: Modifier=Modifier,text:String){
    return Text(text = text, fontWeight = FontWeight.Bold, modifier = modifier)
}