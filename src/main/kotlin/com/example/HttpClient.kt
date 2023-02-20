package com.example

import io.ktor.client.*
import io.ktor.client.engine.*
import io.ktor.client.engine.apache.*
import io.ktor.client.engine.cio.*
import io.ktor.client.engine.java.*
import io.ktor.client.engine.okhttp.*
import io.ktor.client.plugins.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.http.*
import io.ktor.serialization.kotlinx.*
import kotlinx.serialization.json.Json

val apacheHttpClient = createHttpClient(Apache.create())
val javaHttpClient = createHttpClient(Java.create())
val cioHttpClient = createHttpClient(CIO.create())
val okHttpClient = createHttpClient(OkHttp.create())

private fun createHttpClient(httpClientEngine: HttpClientEngine) = HttpClient(httpClientEngine) {
    expectSuccess = true
    install(ContentNegotiation) {
        serialization(ContentType.Application.Json, Json {
            encodeDefaults = true
            ignoreUnknownKeys = true
        })
    }
    defaultRequest {
        contentType(ContentType.Application.Json)
    }
    install(HttpTimeout) {
        requestTimeoutMillis = 2000
    }
}