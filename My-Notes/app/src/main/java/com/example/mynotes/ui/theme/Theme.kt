package com.example.mynotes.ui.theme

import android.app.Activity
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MovableContent
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat
import com.google.accompanist.systemuicontroller.rememberSystemUiController

private val lightTheme = lightColorScheme(
    primary = LightPurple,
    secondary = Gray,
    background = LightBackground
)

private val darkTheme = darkColorScheme(
    primary = DarkPurple,
    onPrimary = White,
    secondary = White,
    background = DarkBackground
)

@Composable
fun MyNotesTheme(
    theme: String,
    content: @Composable () -> Unit
) {

    val colorScheme = when (theme) {
        "1" -> lightTheme
        else -> darkTheme
    }

    // Configura a cor da status bar de forma recomendada
    val systemUiController = rememberSystemUiController()
    val useDarkIcons = theme == "1" // ícones escuros se fundo for claro

    SideEffect {
        systemUiController.setStatusBarColor(
            color = colorScheme.background,
            darkIcons = useDarkIcons
        )
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )

}
