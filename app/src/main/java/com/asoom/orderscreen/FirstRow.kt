package com.asoom.orderscreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.asoom.orderscreen.R

@Composable
fun FirstRow(){
    Row( modifier = Modifier.fillMaxWidth()
        .padding(10.dp),
        verticalAlignment = Alignment.CenterVertically

    ) {
        Image(painter = painterResource(id = R.drawable.mcdonalds) ,
            contentDescription ="mcdonalds" ,
            modifier = Modifier.weight(.1f))

        Column(modifier = Modifier.weight(.5f).padding(7.dp)) {
            Text(text = "McDonald's", style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.Bold
            )
            Text(text = "#01234567" , style = MaterialTheme.typography.bodySmall)
        }

        Column(modifier = Modifier.weight(.3f)) {
            Text(text = "52", style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.Bold, color = Color.Red)
            Text(text = "Delivery Code", style = MaterialTheme.typography.bodySmall)
        }

    }
}
