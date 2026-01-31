package com.hanas.janusleaf

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform