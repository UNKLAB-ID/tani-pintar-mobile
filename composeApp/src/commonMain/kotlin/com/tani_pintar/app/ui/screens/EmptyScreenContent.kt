package com.tani_pintar.app.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tani_pintar.app.ui.components.PrimaryButton
import com.tani_pintar.app.utils.pxToSp
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.muhammadsayed.bookstorecmp.theme.AppTheme
import tani_pintar.composeapp.generated.resources.Res
import tani_pintar.composeapp.generated.resources.emptystate

@Composable
fun EmptyScreenContent(
    title: String,
    description: String,
    onClick: () -> Unit = {}
) {
    Box(
        modifier = Modifier.background(Color.White),
        contentAlignment = Alignment.Center,
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ){
            Image(
                painter = painterResource(Res.drawable.emptystate),
                contentDescription = "No data available",
                modifier = Modifier.padding(bottom = 15.dp)
            )
            Text(
                text = title,
                style = MaterialTheme.typography.titleLarge.copy(
                    color = MaterialTheme.colorScheme.onPrimary,
                    fontWeight = FontWeight.W700,
                    fontSize = pxToSp(25f).sp,
                    lineHeight = pxToSp(25.2f).sp

                )
            )
            Text(
                text = description,
                style = MaterialTheme.typography.bodyMedium.copy(
                    color = MaterialTheme.colorScheme.onPrimary
                )
            )
            Spacer(modifier = Modifier.height(20.dp))
            PrimaryButton(
                title = "Enable connection",
                onClick = {
                    onClick()
                },
                modifier = Modifier.padding(horizontal = 50.dp)
            )
        }
    }
}


@Composable
@Preview
fun PreviewEmptyScreen(){
    AppTheme{
        Surface {
            EmptyScreenContent(
                title = "No Internet",
                description = "Please check your internet connection"
            )
        }
    }
}