package kz.rivet.app.designsystem.theme

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

enum class RivetWidthClass { CompactSmall, Compact, Medium, Expanded }

fun rivetWidthClass(width: Dp): RivetWidthClass = when {
    width < 360.dp -> RivetWidthClass.CompactSmall
    width < 600.dp -> RivetWidthClass.Compact
    width < 840.dp -> RivetWidthClass.Medium
    else -> RivetWidthClass.Expanded
}

fun horizontalContentPadding(widthClass: RivetWidthClass): Dp = when (widthClass) {
    RivetWidthClass.CompactSmall -> 12.dp
    RivetWidthClass.Compact -> 20.dp
    RivetWidthClass.Medium -> 24.dp
    RivetWidthClass.Expanded -> 32.dp
}
