package com.example

import io.ktor.http.*
import io.ktor.serialization.kotlinx.json.*
import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.ktor.server.plugins.contentnegotiation.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun main() {
    embeddedServer(Netty, port = 8081, module = Application::module).start(wait = true)
}

private fun Application.module() {
    install(ContentNegotiation) {
        json()
    }

    routing {
        get("/request") {
            call.respondText(
                text = "response",
                status = HttpStatusCode.OK
            )
        }
    }
}
