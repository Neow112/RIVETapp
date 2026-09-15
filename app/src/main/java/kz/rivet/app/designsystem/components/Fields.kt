package kz.rivet.app.designsystem.components

import androidx.compose.foundation.layout.heightIn
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kz.rivet.app.designsystem.theme.RivetColors

@Composable
fun RivetTextField(value: String, onValueChange: (String) -> Unit, label: String, modifier: Modifier = Modifier) {
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        label = { Text(label) },
        singleLine = true,
        modifier = modifier.heightIn(min = 52.dp),
        colors = OutlinedTextFieldDefaults.colors(
            focusedBorderColor = RivetColors.Primary,
            unfocusedBorderColor = RivetColors.Border,
            focusedContainerColor = RivetColors.Background,
            unfocusedContainerColor = RivetColors.Surface
        )
    )
}
