package com.example.prexamen.screens

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SuggestionChip
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.example.prexamen.data.model.Photo
import com.example.prexamen.ui.theme.PrexamenTheme

@Composable
fun PhotoDetailsScreen(
    photoId: Int
) {
    val photo = Photo(
        id = photoId,
        title = "Photo",
        description = "Photo Description",
        url = "https://picsum.photos/id/${photoId}/1100",
    )

    Scaffold { innerPadding -> // por ahora usamos el scaffold con innerPadding
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(
                space = 24.dp,
                alignment = Alignment.CenterVertically
            )
        ) {
            AsyncImage(
                model = photo.url, // hay que hacer ref a la imagen desde el manifest
                contentDescription = photo.description,
                onError = {// para cuando hayan errores
                    Log.e("PhotoDeatailScreen", it.result.throwable?.message.toString())
                },
                modifier = Modifier.clip(
                    shape = MaterialTheme.shapes.extraLarge
                )
            )
            Text(
                text = photo.title,
                color = MaterialTheme.colorScheme.tertiary,
                style = MaterialTheme.typography.headlineLarge
            )
            Text(
                text = photo.description,
                color = MaterialTheme.colorScheme.tertiary,
                style = MaterialTheme.typography.headlineSmall
            )
            Row(
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                SuggestionChip(
                    onClick = { /*TODO*/ },
                    label = {
                        Text(text = "Favorita")
                    },
                    icon = {
                        Icon(
                            imageVector = Icons.Outlined.Favorite,
                            contentDescription = "Favorita"
                        )
                    }
                )
                SuggestionChip(
                    onClick = { /*TODO*/ },
                    label = {
                        Text(text = "Compartir")
                    },
                    icon = {
                        Icon(
                            imageVector = Icons.Default.Share,
                            contentDescription = "Compartir"
                        )
                    }
                )
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun PhotoDetailsScreenPreview() {
    PrexamenTheme(dynamicColor = false) { // dynamicColor controla el tema oscuro o claro
        PhotoDetailsScreen(33)
    }
}