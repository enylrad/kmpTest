package es.enylrad.kmptest.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import es.enylrad.kmptest.core.mock.movies
import es.enylrad.kmptest.ui.component.MovieItem
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun HomeScreen() {
    LazyVerticalGrid(
        columns = GridCells.Adaptive(120.dp),
        contentPadding = PaddingValues(4.dp),
        horizontalArrangement = Arrangement.spacedBy(4.dp),
        verticalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        items(movies, key = { it.id }) {
            MovieItem(movie = it)
        }
    }
}

@Preview
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}