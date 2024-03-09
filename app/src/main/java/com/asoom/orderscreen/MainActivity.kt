package com.asoom.orderscreen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BottomSheetScaffold
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Box(
                contentAlignment = Alignment.TopCenter,
                   modifier = Modifier
                    .fillMaxWidth(),

            ) {
                Image(
                    modifier = Modifier
                       // .fillMaxSize()
                    .align(Alignment.TopCenter)
                        .fillMaxSize()
                        ,  contentScale = ContentScale.FillBounds,

                    painter = painterResource(id = R.drawable.map),
                    contentDescription = "MAP"
                )

            }


                BottomSheetScaffold(
                    sheetContent = {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(350.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Column (modifier = Modifier
                                .fillMaxSize()){
                                FirstRow()
                                LineAfterSection()
                                SecondRow()
                                ThirdRow()
                                Fourth()
                                FifthRow()

                            }
                        }
                    }

                ) {
                }
            }
        }

}
@Composable
private fun LineAfterSection() {
    Divider(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 10.dp, top = 5.dp, end = 10.dp, bottom = 5.dp),
        color = Color.LightGray,
        thickness = 0.dp
    )
}