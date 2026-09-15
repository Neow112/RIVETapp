package kz.rivet.app.designsystem.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import kz.rivet.app.designsystem.theme.RivetColors

@Composable
fun RivetStatusChip(text: String, kind: StatusKind, modifier: Modifier = Modifier) {
    val (bg, fg) = when (kind) {
        StatusKind.Success -> Color(0xFFE6F8F3) to RivetColors.SuccessText
        StatusKind.Warning -> Color(0xFFFFF3D8) to RivetColors.WarningText
        StatusKind.Error -> Color(0xFFFFE7EB) to RivetColors.ErrorText
        StatusKind.Info -> Color(0xFFEAF1FF) to RivetColors.Primary
        StatusKind.Neutral -> RivetColors.Surface to RivetColors.Secondary
    }
    Box(modifier.background(bg, RoundedCornerShape(999.dp)).padding(horizontal = 10.dp, vertical = 6.dp)) {
        Text(text = text, color = fg, style = androidx.compose.material3.MaterialTheme.typography.bodySmall)
    }
}

enum class StatusKind { Success, Warning, Error, Info, Neutral }
