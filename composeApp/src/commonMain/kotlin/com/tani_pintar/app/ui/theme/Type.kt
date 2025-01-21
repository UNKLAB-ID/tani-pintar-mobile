package org.muhammadsayed.bookstorecmp.theme

import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.Font
import org.jetbrains.compose.resources.FontResource
import tani_pintar.composeapp.generated.resources.Res
import tani_pintar.composeapp.generated.resources.plusjakartasans_bold
import tani_pintar.composeapp.generated.resources.plusjakartasans_extrabold
import tani_pintar.composeapp.generated.resources.plusjakartasans_extralight
import tani_pintar.composeapp.generated.resources.plusjakartasans_light
import tani_pintar.composeapp.generated.resources.plusjakartasans_medium
import tani_pintar.composeapp.generated.resources.plusjakartasans_regular
import tani_pintar.composeapp.generated.resources.plusjakartasans_semibold


@OptIn(ExperimentalResourceApi::class)
object AppFont {
    val JakartaSansRegular
        @Composable
        get() = FontFamily(
            Font(
                resource = Res.font.plusjakartasans_regular,
                weight = FontWeight.Normal
            )
        )
    val JakartaSansMedium
    @Composable
    get() = FontFamily(
        Font(
            resource = Res.font.plusjakartasans_medium,
            weight = FontWeight.Medium
        )
    )
    val JakartaSansLight
    @Composable
    get() = FontFamily(
        Font(
            resource = Res.font.plusjakartasans_light,
            weight = FontWeight.Light
        )
    )

    val JakartaSansSemiBold
    @Composable
    get() = FontFamily(
        Font(
            resource = Res.font.plusjakartasans_semibold,
            weight = FontWeight.SemiBold
        )
    )

    val JakartaSansBold
    @Composable
    get() = FontFamily(
        Font(
            resource = Res.font.plusjakartasans_bold,
            weight = FontWeight.Bold
        )
    )

    val JakartaSansExtraBold
    @Composable
    get() = FontFamily(
        Font(
            resource = Res.font.plusjakartasans_extrabold,
            weight = FontWeight.ExtraBold
        )
    )

    val JakartaSansExtraLight
    @Composable
    get() = FontFamily(
        Font(
            resource = Res.font.plusjakartasans_extralight,
            weight = FontWeight.ExtraLight
        )
    )
}

@Composable
fun getTypography(): Typography {
    return Typography(
        // Display styles
        displayLarge = TextStyle(
            fontFamily = AppFont.JakartaSansExtraBold,
            fontWeight = FontWeight.ExtraBold,
            fontSize = 57.sp,
            lineHeight = 64.sp,
            letterSpacing = (-0.25).sp
        ),
        displayMedium = TextStyle(
            fontFamily = AppFont.JakartaSansExtraBold,
            fontWeight = FontWeight.ExtraBold,
            fontSize = 45.sp,
            lineHeight = 52.sp,
            letterSpacing = 0.sp
        ),
        displaySmall = TextStyle(
            fontFamily = AppFont.JakartaSansExtraBold,
            fontWeight = FontWeight.ExtraBold,
            fontSize = 36.sp,
            lineHeight = 44.sp,
            letterSpacing = 0.sp
        ),

        // Headline styles
        headlineLarge = TextStyle(
            fontFamily = AppFont.JakartaSansBold,
            fontWeight = FontWeight.Bold,
            fontSize = 32.sp,
            lineHeight = 40.sp,
            letterSpacing = 0.sp
        ),
        headlineMedium = TextStyle(
            fontFamily = AppFont.JakartaSansBold,
            fontWeight = FontWeight.Bold,
            fontSize = 28.sp,
            lineHeight = 36.sp,
            letterSpacing = 0.sp
        ),
        headlineSmall = TextStyle(
            fontFamily = AppFont.JakartaSansSemiBold,
            fontWeight = FontWeight.SemiBold,
            fontSize = 24.sp,
            lineHeight = 32.sp,
            letterSpacing = 0.sp
        ),

        // Title styles
        titleLarge = TextStyle(
            fontFamily = AppFont.JakartaSansSemiBold,
            fontWeight = FontWeight.SemiBold,
            fontSize = 22.sp,
            lineHeight = 28.sp,
            letterSpacing = 0.sp
        ),
        titleMedium = TextStyle(
            fontFamily = AppFont.JakartaSansMedium,
            fontWeight = FontWeight.Medium,
            fontSize = 16.sp,
            lineHeight = 24.sp,
            letterSpacing = 0.15.sp
        ),
        titleSmall = TextStyle(
            fontFamily = AppFont.JakartaSansLight,
            fontWeight = FontWeight.Light,
            fontSize = 14.sp,
            lineHeight = 20.sp,
            letterSpacing = 0.1.sp
        ),

        // Body styles
        bodyLarge = TextStyle(
            fontFamily = AppFont.JakartaSansRegular,
            fontWeight = FontWeight.Normal,
            fontSize = 16.sp,
            lineHeight = 24.sp,
            letterSpacing = 0.5.sp
        ),
        bodyMedium = TextStyle(
            fontFamily = AppFont.JakartaSansLight,
            fontWeight = FontWeight.Light,
            fontSize = 14.sp,
            lineHeight = 20.sp,
            letterSpacing = 0.25.sp
        ),
        bodySmall = TextStyle(
            fontFamily = AppFont.JakartaSansExtraLight,
            fontWeight = FontWeight.ExtraLight,
            fontSize = 12.sp,
            lineHeight = 16.sp,
            letterSpacing = 0.4.sp
        ),

        // Label styles
        labelLarge = TextStyle(
            fontFamily = AppFont.JakartaSansMedium,
            fontWeight = FontWeight.Medium,
            fontSize = 14.sp,
            lineHeight = 20.sp,
            letterSpacing = 0.1.sp
        ),
        labelMedium = TextStyle(
            fontFamily = AppFont.JakartaSansLight,
            fontWeight = FontWeight.Light,
            fontSize = 12.sp,
            lineHeight = 16.sp,
            letterSpacing = 0.5.sp
        ),
        labelSmall = TextStyle(
            fontFamily = AppFont.JakartaSansExtraLight,
            fontWeight = FontWeight.ExtraLight,
            fontSize = 11.sp,
            lineHeight = 16.sp,
            letterSpacing = 0.5.sp
        )
    )
}