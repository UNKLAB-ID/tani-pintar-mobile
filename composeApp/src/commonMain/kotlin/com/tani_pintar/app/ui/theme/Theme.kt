package org.muhammadsayed.bookstorecmp.theme


import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color


private val lightThemeColors = lightColorScheme(
    primary = AppColors.Primary500,
    primaryContainer = AppColors.Primary400,
    onPrimary = NeutralColors.Neutral900,
    secondary = GreyColors.Grey50,
    secondaryContainer = SuccessColors.Success300,
    error = ErrorColors.Error600,
    onError = ErrorColors.Error200,
    background = GreyColors.Grey100,
    onBackground = NeutralColors.Neutral1000,
    surface = GreyColors.Grey50,
    onSurface = NeutralColors.Neutral900
)

private val darkThemeColors = darkColorScheme(
    primary = AppColors.Primary500,
    primaryContainer = AppColors.Primary700,
    onPrimary = GreyColors.Grey50,
    secondary = NeutralColors.Neutral900,
    secondaryContainer = SuccessColors.Success700,
    error = ErrorColors.Error300,
    onError = ErrorColors.Error100,
    background = NeutralColors.Neutral1000,
    onBackground = GreyColors.Grey50,
    surface = NeutralColors.Neutral800,
    onSurface = GreyColors.Grey50
)

@Composable
fun AppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    isNetworkAvailable: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        darkTheme -> darkThemeColors
        else -> lightThemeColors
    }
    MaterialTheme(
        colorScheme = colorScheme,
        typography = getTypography(),
        shapes = Shapes
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
        ) {
            Column {
                if (!isNetworkAvailable) {
//                    NoConnectionAvailable()
                }
                content()
            }
        }
    }
}