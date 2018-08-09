package example

import io.ktor.application.call
import io.ktor.http.ContentType
import io.ktor.http.HttpMethod
import io.ktor.response.respondText
import io.ktor.routing.*
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty

fun main(args: Array<String>) {
    val server = embeddedServer(Netty, port = 8080) {
        routing {
            route("/users") {
                get {
                    call.respondText("get /users")
                }
                post {
                    call.respondText("post /users")
                }
                route("/{id}") {
                    get {
                        val id = call.parameters["id"]
                        call.respondText("get /users/$id")
                    }
                    post {
                        val id = call.parameters["id"]
                        call.respondText("post /users/$id")
                    }
                    put {
                        val id = call.parameters["id"]
                        call.respondText("put /users/$id")
                    }
                    delete {
                        val id = call.parameters["id"]
                        call.respondText("delete /users/$id")
                    }
                    method(HttpMethod("CUSTOM")) {
                        handle {
                            val id = call.parameters["id"]
                            call.respondText("CUSTOM /users/$id")
                        }
                    }
                }
            }
        }
    }
    server.start(wait = true)
}
