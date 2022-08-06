package com.example.plugins

import io.ktor.http.*
import io.ktor.server.plugins.defaultheaders.*
import io.ktor.server.application.*
import java.time.Duration

fun Application.configureDefaultHeaders() {
    install(DefaultHeaders) {
        val cacheTime = Duration.ofDays(365).seconds
        header(
            name = HttpHeaders.CacheControl,
            "public, max-age=$cacheTime , immutable"
        ) // will send this header with each response
    }

}
