package com.hanas.janusleaf.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

@Serializable
data object HomeNavKey : NavKey

fun EntryProviderScope<NavKey>.homeNavEntry() {
    entry<HomeNavKey> {
        HomeScreen()
    }
}

@Composable
fun HomeScreen() {
    Scaffold {
        Column(Modifier.padding(it)) {
            Text("Home Screen")
        }
    }
}

@Preview(device = Devices.PHONE)
@Preview(device = "spec:width=411dp,height=891dp,orientation=landscape")
@Preview(device = Devices.FOLDABLE)
@Preview(device = Devices.TABLET)
@Composable
fun HomeScreenPreview() {
    MaterialTheme {
        HomeScreen()
    }
}