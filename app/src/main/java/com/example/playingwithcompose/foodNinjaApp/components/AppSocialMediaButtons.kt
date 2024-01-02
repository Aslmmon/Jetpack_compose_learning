package com.example.playingwithcompose.foodNinjaApp.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun socialMediaButtons(image: Int, facebookTitle: String) {

    ApplyBorderline {
        Row {
            Image(
                painterResource(id = image),
                contentDescription = null,
                modifier = Modifier.size(50.dp, 25.dp)
            )
            Text(
                text = facebookTitle,
                textAlign = TextAlign.Center,
                color = Color.Black,
                fontWeight = FontWeight.Bold,

                modifier = Modifier.padding(4.dp),
            )
        }

    }


}
@Composable
fun ApplyBorderline(composeable: @Composable () -> Unit) {
    Box(
        modifier = Modifier
            .border(
                border = BorderStroke(0.5.dp, color = Color.Gray.copy(alpha = 0.2f)),
                shape = RoundedCornerShape(10.dp)
            )
            .padding(10.dp)
    ) {
        composeable.invoke()
    }
}