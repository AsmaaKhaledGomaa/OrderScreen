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

@Composable
fun Fourth(){
    Row( modifier = Modifier
        .fillMaxWidth()
        .padding(10.dp),
        verticalAlignment = Alignment.CenterVertically

    ) {
            Text(text = "2 x Items" , style = MaterialTheme.typography.bodySmall,
                modifier = Modifier.weight(.5f)
            )
            Text(text = "20.00", style = MaterialTheme.typography.bodySmall,fontWeight = FontWeight.Bold,
                modifier = Modifier.weight(.5f))
    }
}



