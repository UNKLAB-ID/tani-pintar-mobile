package com.tani_pintar.app.ui.screens.splash_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.key.Key.Companion.R
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.InternalResourceApi
import tani_pintar.composeapp.generated.resources.Res
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource
import tani_pintar.composeapp.generated.resources._1
import tani_pintar.composeapp.generated.resources.capca1
import tani_pintar.composeapp.generated.resources.image_test
import tani_pintar.composeapp.generated.resources.tani_pintar

@OptIn(ExperimentalResourceApi::class, InternalResourceApi::class)
@Composable
fun SplashScreen(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Red),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(Res.drawable.capca1),
            contentDescription = "Logo"
        )
    }
}