package com.example

import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.request.*
import io.ktor.http.*
import io.ktor.serialization.kotlinx.json.*
import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.ktor.server.plugins.contentnegotiation.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import kotlin.time.ExperimentalTime
import kotlin.time.measureTimedValue

fun main() {
    embeddedServer(Netty, port = 8080, module = Application::module).start(wait = true)
}

private fun Application.module() {
    install(ContentNegotiation) {
        json()
    }

    routing {
        get("/cio") {
            call.runRequest("cio", cioHttpClient)
        }
        get("apache") {
            call.runRequest("apache", apacheHttpClient)
        }
        get("okhttp") {
            call.runRequest("okhttp", okHttpClient)
        }
        get("java") {
            call.runRequest("java", javaHttpClient)
        }
    }
}

@OptIn(ExperimentalTime::class)
private suspend fun ApplicationCall.runRequest(name: String, httpClient: HttpClient) = try {
    val result = measureTimedValue {
        httpClient.get("http://localhost:8081/request").body<String>()
    }

    respondText(
        text = """$name = ${result.duration.inWholeMilliseconds}""",
        status = HttpStatusCode.OK
    )
} catch (e: Throwable) {
    respondText(
        text = e.message ?: "no message",
        status = HttpStatusCode.InternalServerError
    )
}