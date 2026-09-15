package kz.rivet.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import kz.rivet.app.catalog.DeveloperCatalogScreen
import kz.rivet.app.designsystem.theme.RivetTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            RivetTheme { DeveloperCatalogScreen() }
        }
    }
}
