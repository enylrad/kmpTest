package es.enylrad.kmptest.core.mock

import es.enylrad.kmptest.core.model.Movie

val movies = (1..100).map {
    Movie(
        id = it,
        title = "Movie $it",
        poster = "https://picsum.photos/200/300?random=$it"
    )
}