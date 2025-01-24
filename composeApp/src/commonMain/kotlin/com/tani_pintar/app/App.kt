package com.tani_pintar.app

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.tani_pintar.app.ui.screens.EmptyScreenContent
import com.tani_pintar.app.ui.screens.list.ListScreen
import com.tani_pintar.app.ui.screens.splash_screen.SplashScreen
import kotlinx.serialization.Serializable
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.muhammadsayed.bookstorecmp.theme.AppTheme

@Serializable
object ListDestination

@Serializable
data class DetailDestination(val objectId: Int)

@Composable
fun App() {
    PreviewComponentApp()
}


@Composable
fun MainApp(){
    AppTheme {
        Surface {
            val navController: NavHostController = rememberNavController()
            NavHost(navController = navController, startDestination = "empty_screen") {
                composable("splash_screen") { SplashScreen(navController) }
                composable<ListDestination> {
                    ListScreen(navigateToDetails = { objectId ->
                        navController.navigate(DetailDestination(objectId))
                    })
                }
            }
        }
    }
}

@Composable
fun PreviewComponentApp() {
    AppTheme {
        EmptyScreenContent(
            title = "No Internet",
            description = "Please check your internet connection"
        )
    }
}