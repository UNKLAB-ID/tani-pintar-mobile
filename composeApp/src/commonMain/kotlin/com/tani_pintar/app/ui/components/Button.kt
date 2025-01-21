package com.tani_pintar.app.ui.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tani_pintar.app.utils.pxToSp
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.muhammadsayed.bookstorecmp.theme.AppColors.Primary600
import org.muhammadsayed.bookstorecmp.theme.AppTheme
import org.muhammadsayed.bookstorecmp.theme.NeutralColors.Neutral800

@Composable
fun PrimaryButton(
    title: String,
    onClick: () -> Unit = {},
    modifier: Modifier
) {
    Button(
        modifier = modifier
            .height(55.dp)
            .shadow(
                elevation = 10.dp,
                shape = RoundedCornerShape(24.dp),
                spotColor = Color(0x641B69FD),
                ambientColor = Color(0x641B69FD),
                clip = false,
            ),
        onClick = {
            onClick()
        },
        shape = RoundedCornerShape(24.dp),
        contentPadding = PaddingValues(vertical = 12.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = Primary600,
            contentColor = Color.White,
            disabledContainerColor = Neutral800,
            disabledContentColor = Color.LightGray
        )
    ) {
        Text(
            text = title,
            style = MaterialTheme.typography.titleLarge.copy(
                fontWeight = FontWeight.W700,
                 fontSize = pxToSp(18f).sp,
                lineHeight = pxToSp(22.68f).sp
            )
        )
    }
}

@Composable
@Preview
fun PreviewPrimaryButton() {
    AppTheme{
        Surface {
            PrimaryButton(
                title = "Enable connection",
                modifier = Modifier.fillMaxWidth()
            )
        }
    }

}