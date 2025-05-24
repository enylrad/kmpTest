package es.enylrad.kmptest.ui.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import es.enylrad.kmptest.core.model.Movie

@Composable
fun MovieItem(movie: Movie) {
    Column {
        AsyncImage(
            modifier = Modifier
                .fillMaxWidth()
                .aspectRatio(2 / 3f)
                .clip(MaterialTheme.shapes.small),
            model = movie.poster,
            contentDescription = movie.title,
            contentScale = ContentScale.Crop
        )
        Text(
            modifier = Modifier.padding(8.dp),
            text = movie.title,
            style = MaterialTheme.typography.bodySmall,
            maxLines = 1
        )
    }
}