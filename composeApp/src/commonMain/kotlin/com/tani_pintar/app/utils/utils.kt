package com.tani_pintar.app.utils

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.ui.platform.LocalDensity


@Composable
@ReadOnlyComposable
fun pxToDp(px: Float): Float {
    val density = LocalDensity.current.density // Get screen density
    return px / density
}


@Composable
@ReadOnlyComposable
fun pxToSp(px: Float): Float {
    val fontScale = LocalDensity.current.fontScale // Get font scale
    return px / fontScale
}
