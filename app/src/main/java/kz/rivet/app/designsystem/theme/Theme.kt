package kz.rivet.app.designsystem.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val LightColors = lightColorScheme(
    primary = RivetColors.Primary,
    secondary = RivetColors.Accent,
    background = RivetColors.Background,
    surface = RivetColors.Surface,
    onPrimary = RivetColors.Background,
    onSecondary = RivetColors.Text,
    onBackground = RivetColors.Text,
    onSurface = RivetColors.Text,
    outline = RivetColors.Border,
    error = RivetColors.ErrorText
)

@Composable
fun RivetTheme(content: @Composable () -> Unit) {
    // Full dark-screen references are not final yet. Keep the canonical light palette
    // as the source of truth until dark tokens are approved.
    MaterialTheme(
        colorScheme = LightColors,
        typography = RivetTypography,
        content = content
    )
}
