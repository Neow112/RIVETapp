package kz.rivet.app.designsystem.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import kz.rivet.app.designsystem.theme.RivetColors
import kz.rivet.app.designsystem.theme.RivetDimens

@Composable
fun RivetPrimaryButton(text: String, onClick: () -> Unit, modifier: Modifier = Modifier, enabled: Boolean = true) {
    Button(
        onClick = onClick,
        modifier = modifier.height(RivetDimens.Button),
        enabled = enabled,
        colors = ButtonDefaults.buttonColors(containerColor = RivetColors.Primary, contentColor = Color.White)
    ) { Text(text) }
}

@Composable
fun RivetOutlineButton(text: String, onClick: () -> Unit, modifier: Modifier = Modifier) {
    OutlinedButton(onClick = onClick, modifier = modifier.height(48.dp)) { Text(text) }
}
