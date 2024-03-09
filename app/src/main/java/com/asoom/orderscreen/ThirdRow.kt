package com.asoom.orderscreen

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun ThirdRow(){
    Row( modifier = Modifier.fillMaxWidth()
            .padding(10.dp),
            verticalAlignment = Alignment.CenterVertically

    ){
        Text(modifier = Modifier.weight(.7f),
            text = "Jackson S.is on the way to deliver " +
                "your order.ETA 09:41 PM",
            style = MaterialTheme.typography.bodyMedium,
            maxLines = 2)


        CircularProgressIndicator(
            modifier = Modifier.weight(.13f),
            progress = 0.6f, // Specify a value between 0.0 and 1.0
            color = Color.Green,
            strokeWidth = 4.dp // Adjust the strokeWidth to make it smaller
        )


    }
}
