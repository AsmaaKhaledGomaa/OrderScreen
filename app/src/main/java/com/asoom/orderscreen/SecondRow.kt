package com.asoom.orderscreen

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun SecondRow() {
    val steps = listOf(
        R.drawable.food,
        R.drawable.food,
        R.drawable.food,
        R.drawable.food
    )
    val currentStep = 2

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(2.dp)
                //.background(Color.Red) // Change color to red
        ) {
            DashedProgressBar(progress = .8f)
        }

        // Step icons
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            steps.forEachIndexed { index, step ->
                Box(
                    modifier = Modifier
                        .size(35.dp)
                        .clip(CircleShape)
                        .background(if (index <= currentStep) Color.Red else Color.Gray)
                        .padding(4.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        painter = painterResource(id = step),
                        contentDescription = null
                    )
                }
            }
        }
    }
}

@Composable
fun DashedProgressBar(progress: Float) {
    val pathEffect = PathEffect.dashPathEffect(floatArrayOf(10f, 10f), 0f)

    Canvas(modifier = Modifier.fillMaxSize()) {
        // Draw the background bar
        drawLine(
            color = Color.LightGray,
            start = Offset(x = 0f, y = size.height / 2),
            end = Offset(x = size.width, y = size.height / 2),
            pathEffect = pathEffect,
            strokeWidth = 10f
        )

        // Draw the progress bar with dashes
        drawLine(
            color = Color.Red,
            start = Offset(x = 0f, y = size.height / 2),
            end = Offset(x = size.width * progress, y = size.height / 2),
            pathEffect = pathEffect,
            strokeWidth = 10f
        )
    }
}

