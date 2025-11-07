package com.example.prexamen.serializable

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation3.runtime.NavKey
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay
import com.example.prexamen.screens.MainScreen
import com.example.prexamen.screens.PhotoDetailsScreen
import kotlinx.serialization.Serializable

@Serializable
data object MainScreenKey : NavKey

@Serializable
data class PhotoDetailsScreenKey(val phoyoId: Int) : NavKey

@Composable
fun NavigationRoot(
    modifier: Modifier = Modifier
) {
    val backStack = rememberNavBackStack(
        MainScreenKey,
        PhotoDetailsScreenKey(34),
        PhotoDetailsScreenKey(35)
    )

    NavDisplay(
        backStack = backStack,
        modifier = modifier,
        entryProvider = entryProvider {
            entry<MainScreenKey> {
                //backStack.add(PhotoDetailsScreenKey(34))
                MainScreen()
            }
            entry<PhotoDetailsScreenKey> {
                PhotoDetailsScreen(it.phoyoId)
            }

        }
    )
}