package kz.rivet.app.catalog

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kz.rivet.app.designsystem.components.*
import kz.rivet.app.designsystem.theme.*

@Composable
fun DeveloperCatalogScreen() {
    var field by remember { mutableStateOf("") }
    Scaffold(containerColor = RivetColors.Background) { insets ->
        BoxWithConstraints(Modifier.fillMaxSize().padding(insets)) {
            val widthClass = rivetWidthClass(maxWidth)
            val horizontal = horizontalContentPadding(widthClass)
            Column(
                Modifier.fillMaxSize().verticalScroll(rememberScrollState()).padding(horizontal = horizontal, vertical = 24.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                Text("RIVET", style = MaterialTheme.typography.headlineMedium)
                Text("Developer build · Design System", style = MaterialTheme.typography.bodyMedium, color = RivetColors.Secondary)
                Text("Width class: $widthClass", style = MaterialTheme.typography.bodySmall, color = RivetColors.Secondary)

                RivetCard(Modifier.fillMaxWidth()) {
                    Text("Типографика", style = MaterialTheme.typography.titleLarge)
                    Spacer(Modifier.height(12.dp))
                    Text("Заголовок карточки", style = MaterialTheme.typography.titleMedium)
                    Text("Основной текст интерфейса и описаний.", style = MaterialTheme.typography.bodyMedium)
                    Text("Метаданные · 12/17", style = MaterialTheme.typography.bodySmall, color = RivetColors.Secondary)
                }

                RivetPrimaryButton("Основная кнопка", onClick = {}, modifier = Modifier.fillMaxWidth())
                RivetOutlineButton("Контурная кнопка", onClick = {}, modifier = Modifier.fillMaxWidth())
                RivetTextField(field, { field = it }, "Название", Modifier.fillMaxWidth())

                Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    RivetStatusChip("В работе", StatusKind.Success)
                    RivetStatusChip("На проверке", StatusKind.Warning)
                }
                Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    RivetStatusChip("Ошибка", StatusKind.Error)
                    RivetStatusChip("Новая", StatusKind.Info)
                }

                RivetCard(Modifier.fillMaxWidth()) {
                    Text("UROLA M6 COEX", style = MaterialTheme.typography.titleMedium)
                    Text("Экструдер · Линия № 2", color = RivetColors.Secondary)
                    Spacer(Modifier.height(10.dp))
                    RivetStatusChip("В работе", StatusKind.Success)
                }

                Spacer(Modifier.height(32.dp))
            }
        }
    }
}
