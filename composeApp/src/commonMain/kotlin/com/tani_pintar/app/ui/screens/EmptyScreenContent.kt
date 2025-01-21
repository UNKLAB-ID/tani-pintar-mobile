package com.tani_pintar.app.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.tani_pintar.app.ui.components.PrimaryButton
import tani_pintar.composeapp.generated.resources.Res
//import tani_pintar.composeapp.generated.resources.no_data_available
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.stringResource

@OptIn(ExperimentalResourceApi::class)
@Composable
fun EmptyScreenContent(
    navController: NavController,
) {
    Box(
        modifier = Modifier,
        contentAlignment = Alignment.Center,
    ) {
        Column(){
            Text(text = "No Internet")
            Text(text = "Please check your internet connection")
            PrimaryButton(
                title = "Enable connection",
                onClick = {},
                modifier = Modifier
            )
        }
    }
}
