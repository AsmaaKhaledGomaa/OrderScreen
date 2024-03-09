package com.asoom.orderscreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Card
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
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
fun FifthRow(){
    Card {
        //Modifier.weight(.2f)
        Row( modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically

        ) {
            Image(painter = painterResource(id = R.drawable.person) ,
                contentDescription ="user" ,
                modifier = Modifier.weight(.2f)
                    .padding(5.dp)
            )

            Column(modifier = Modifier
                .weight(.9f)
                .padding(3.dp)) {
                Text(text = "Jackson S.", style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold
                )
                Image(painter = painterResource(id = R.drawable.star) ,
                    contentDescription ="user" ,
                    )            }

            Column(modifier = Modifier.weight(.3f)) {
                Image(painter = painterResource(id = R.drawable.phone) ,
                    contentDescription ="phone" ,
                    modifier = Modifier.weight(.1f)
                        .wrapContentSize(Alignment.CenterEnd)

                )
            }

        }
    }

}

