package est.mkao.emergency.response

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform