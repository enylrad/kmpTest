package es.enylrad.kmptest

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform