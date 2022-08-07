package com.example

import com.example.models.ApiResponse
import com.example.plugins.configureRouting
import com.example.repository.HeroRepository
import com.example.repository.NEXT_PAGE_KEY
import com.example.repository.PREVIOUS_PAGE_KEY
import io.ktor.client.call.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.http.*
import io.ktor.server.testing.*
import io.ktor.util.*
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import org.koin.java.KoinJavaComponent.inject
import kotlin.test.Test
import kotlin.test.assertEquals

class ApplicationTest {

    private val heroRepository: HeroRepository by inject(HeroRepository::class.java)

    @Test
    fun `access root endpoint, assert correct information`() = testApplication {
        application {
            configureRouting()
        }
        client.get("/").apply {
            assertEquals(
                expected = HttpStatusCode.OK,
                actual = status
            )
            assertEquals(
                expected = "Welcome to Boruto API!",
                actual = bodyAsText()
            )
        }
    }


    @Test
    fun `access all heroes endpoint, assert correct information`() = testApplication {
        application {
            configureRouting()
        }
        client.get("/boruto/heroes").apply {
            assertEquals(
                expected = HttpStatusCode.OK,
                actual = status
            )
            val expected = ApiResponse(
                success = true,
                message = "ok",
                prevPage = null,
                nextPage = 2,
                heroes = heroRepository.page1
            )
            val actual = Json.decodeFromString<ApiResponse>(body())

            assertEquals(expected, actual)
        }
    }

    @Test
    fun `access all heroes endpoint, assert correct information for all pages`() = testApplication {
        application {
            configureRouting()
        }
        val pages = 1..5
        pages.forEach { page ->
            client.get("/boruto/heroes?page=$page").apply {
                assertEquals(
                    expected = HttpStatusCode.OK,
                    actual = status
                )
                val expected = ApiResponse(
                    success = true,
                    message = "ok",
                    prevPage = heroRepository.calculatePage(page)[PREVIOUS_PAGE_KEY],
                    nextPage = heroRepository.calculatePage(page)[NEXT_PAGE_KEY],
                    heroes = heroRepository.heroes[page]!!
                )
                val actual = Json.decodeFromString<ApiResponse>(body())

                assertEquals(expected, actual)
            }
        }

    }
}