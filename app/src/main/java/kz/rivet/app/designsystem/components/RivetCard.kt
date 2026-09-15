package kz.rivet.app.designsystem.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kz.rivet.app.designsystem.theme.RivetColors
import kz.rivet.app.designsystem.theme.RivetDimens

@Composable
fun RivetCard(modifier: Modifier = Modifier, content: @Composable ColumnScope.() -> Unit) {
    Card(
        modifier = modifier,
        shape = RoundedCornerShape(RivetDimens.RadiusCard),
        colors = CardDefaults.cardColors(containerColor = RivetColors.Background),
        border = BorderStroke(1.dp, RivetColors.Border),
        content = { Column(Modifier.padding(RivetDimens.CardPadding), content = content) }
    )
}
