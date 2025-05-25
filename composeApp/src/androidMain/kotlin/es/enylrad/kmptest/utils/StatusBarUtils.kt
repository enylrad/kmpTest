package es.enylrad.kmptest.utils

import androidx.activity.ComponentActivity
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat


@Composable
fun EnableTransparentStatusBar() {
    val view = LocalView.current
    val darkMode = isSystemInDarkTheme()
    if (!view.isInEditMode) {
        val window = (view.context as ComponentActivity).window
        WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = !darkMode
    }
}