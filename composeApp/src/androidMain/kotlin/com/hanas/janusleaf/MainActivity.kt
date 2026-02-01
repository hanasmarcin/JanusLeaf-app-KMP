package com.hanas.janusleaf

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay
import com.hanas.janusleaf.home.HomeNavKey
import com.hanas.janusleaf.home.homeNavEntry

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)

        setContent {
            MaterialTheme {
                MainComposable()
            }
        }
    }
}

@Composable
private fun MainComposable() {
    val backStack = rememberNavBackStack(HomeNavKey)
    NavDisplay(
        backStack = backStack,
        entryProvider = entryProvider {
            homeNavEntry()
        }
    )
}