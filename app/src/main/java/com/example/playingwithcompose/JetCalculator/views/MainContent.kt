package com.example.playingwithcompose.JetCalculator.views

import android.util.Log
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.material.Slider
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Remove
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.playingwithcompose.JetCalculator.views.component.InputTextField
import com.example.playingwithcompose.JetCalculator.widgets.RoundIconButton

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun MainContent() {
    val totalBillState = remember {
        mutableStateOf("")
    }
    val totalSplitNumber = remember {
        mutableStateOf(0)
    }
    val validState = remember(totalBillState.value) {
        totalBillState.value.trim().isNotEmpty()
    }
    val isMoreThanOne = remember(totalSplitNumber.value) {
        totalSplitNumber.value > 1
    }
    val sliderValue = remember {
        mutableStateOf(0f)
    }


    val keyboard = LocalSoftwareKeyboardController.current
    Surface(
        modifier = Modifier
            .padding(10.dp)
            .fillMaxWidth()
            .fillMaxHeight(),
        shape = RoundedCornerShape(corner = CornerSize(5.dp)),
        border = BorderStroke(2.dp, color = Color.LightGray),
    ) {
        Column {

            InputTextField(
                valueState = totalBillState,
                labelId = "Enter Bill",
                enabled = true,
                isSingleLine = true,
                onAction = KeyboardActions {
                    if (!validState) return@KeyboardActions
                    keyboard?.hide()
                }
            )

            Row(modifier = Modifier.padding(3.dp), horizontalArrangement = Arrangement.Start) {
                Text(text = "Split")
                Spacer(modifier = Modifier.width(120.dp))
                Row(
                    modifier = Modifier.padding(horizontal = 3.dp),
                    horizontalArrangement = Arrangement.End
                ) {
                    RoundIconButton(imageVector = Icons.Default.Remove, onClick = {
                        Log.d("number", "MainContent: ${isMoreThanOne.toString()}")
                        if (isMoreThanOne) totalSplitNumber.value--
                    })
                    Text(
                        text = totalSplitNumber.value.toString(),
                        modifier = Modifier
                            .align(Alignment.CenterVertically)
                            .padding(start = 9.dp, end = 9.dp)
                    )
                    RoundIconButton(imageVector = Icons.Default.Add, onClick = {
                        totalSplitNumber.value++
                    })
                }
            }

            Row(
                modifier = Modifier.padding(horizontal = 3.dp),
                horizontalArrangement = Arrangement.Start
            ) {
                Text(
                    text = "Tip",
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .padding(start = 9.dp, end = 9.dp)
                )

                Spacer(modifier = Modifier.width(200.dp))

                Text(
                    text = "$33.00",
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .padding(start = 9.dp, end = 9.dp)
                )
            }

            Text(
                text = "33%",
                textAlign = TextAlign.Center,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
            Spacer(modifier = Modifier.height(14.dp))
            Slider(
                modifier = Modifier.padding(5.dp),
                value = sliderValue.value,
                steps = 5,
                onValueChange = { newValue ->
                    sliderValue.value = newValue
                })

        }
    }
}