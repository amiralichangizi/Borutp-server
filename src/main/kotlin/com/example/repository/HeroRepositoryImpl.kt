package com.example.repository

import com.example.models.ApiResponse
import com.example.models.Hero

const val NEXT_PAGE_KEY = "nextPage"
const val PREVIOUS_PAGE_KEY = "prevPage"

class HeroRepositoryImpl : HeroRepository {

    override val heroes: Map<Int, List<Hero>> by lazy {
        mapOf(
            1 to page1,
            2 to page2,
            3 to page3,
            4 to page4,
            5 to page5,
        )
    }

    override val page1: List<Hero> = listOf(
        Hero(
            id = 1,
            name = "Sasuke",
            image = "/images/sasuke.jpg",
            about = "Sasuke Uchiha is one of the last surviving members of Konohagakure's Uchiha clan. After his older brother, Itachi, slaughtered their clan, Sasuke made it his mission in life to avenge them by killing Itachi. He is added to Team 7 upon becoming a ninja and, through competition with his rival and best friend, Naruto Uzumaki.",
            rating = 5.0,
            power = 98,
            month = "July",
            day = "23rd",
            family = listOf(
                "Fugaku",
                "Mikoto",
                "Itachi",
                "Sarada",
                "Sakura"
            ),
            abilities = listOf(
                "Sharingan",
                "Rinnegan",
                "Intelligence"
            ),
            natureTypes = listOf(
                "Lightning",
                "Fire",
                "Wind",
                "Earth",
                "Water"
            )
        ),
        Hero(
            id = 2,
            name = "Naruto",
            image = "/images/naruto.jpg",
            about = "Naruto Uzumaki is one of the last surviving members of Konohagakure's Uchiha clan. After his older brother, Itachi, slaughtered their clan, Sasuke made it his mission in life to avenge them by killing Itachi. He is added to Team 7 upon becoming a ninja and, through competition with his rival and best friend, Naruto Uzumaki.",
            rating = 5.0,
            power = 98,
            month = "Oct",
            day = "10th ",
            family = listOf(
                "Minato",
                "Kushina",
                "Bortuo",
                "Himawari",
                "Hinata"
            ),
            abilities = listOf(
                "Rasengan",
                "Rasen-Shuriken",
                "Senin Mode"
            ),
            natureTypes = listOf(
                "Wind",
                "Earth",
                "Lava",
                "Fire",
            )
        ),
        Hero(
            id = 3,
            name = "Sakura",
            image = "/images/sakura.jpg",
            about = "Sakura Uchiha is one of the last surviving members of Konohagakure's Uchiha clan. After his older brother, Itachi, slaughtered their clan, Sasuke made it his mission in life to avenge them by killing Itachi. He is added to Team 7 upon becoming a ninja and, through competition with his rival and best friend, Naruto Uzumaki.",
            rating = 4.5,
            power = 92,
            month = "Mar",
            day = "28th ",
            family = listOf(
                "Kizashi",
                "Mebuki",
                "Sarada",
                "Sasuke",
            ),
            abilities = listOf(
                "Chakra Control",
                "Medical Ninjutsu",
                "Strength",
                "Intelligence"
            ),
            natureTypes = listOf(
                "Earth",
                "Water",
                "Fire",
            )
        ),
    )
    override val page2: List<Hero> = listOf(
        Hero(
            id = 4,
            name = "Amado",
            image = "/images/amado.jpg",
            about = "Amado Uchiha is one of the last surviving members of Konohagakure's Uchiha clan. After his older brother, Itachi, slaughtered their clan, Sasuke made it his mission in life to avenge them by killing Itachi. He is added to Team 7 upon becoming a ninja and, through competition with his rival and best friend, Naruto Uzumaki.",
            rating = 1.5,
            power = 98,
            month = "July",
            day = "23rd",
            family = listOf(
                "Fugaku",
                "Mikoto",
                "Itachi",
                "Sarada",
                "Sakura"
            ),
            abilities = listOf(
                "Sharingan",
                "Rinnegan",
                "Intelligence"
            ),
            natureTypes = listOf(
                "Lightning",
                "Fire",
                "Wind",
                "Earth",
                "Water"
            )
        ),
        Hero(
            id = 5,
            name = "Boruto",
            image = "/images/boruto.png",
            about = "Naruto Uzumaki is one of the last surviving members of Konohagakure's Uchiha clan. After his older brother, Itachi, slaughtered their clan, Sasuke made it his mission in life to avenge them by killing Itachi. He is added to Team 7 upon becoming a ninja and, through competition with his rival and best friend, Naruto Uzumaki.",
            rating = 2.5,
            power = 98,
            month = "Oct",
            day = "10th ",
            family = listOf(
                "Minato",
                "Kushina",
                "Bortuo",
                "Himawari",
                "Hinata"
            ),
            abilities = listOf(
                "Rasengan",
                "Rasen-Shuriken",
                "Senin Mode"
            ),
            natureTypes = listOf(
                "Wind",
                "Earth",
                "Lava",
                "Fire",
            )
        ),
        Hero(
            id = 6,
            name = "Code",
            image = "/images/code.jpg",
            about = "Code Uchiha is one of the last surviving members of Konohagakure's Uchiha clan. After his older brother, Itachi, slaughtered their clan, Sasuke made it his mission in life to avenge them by killing Itachi. He is added to Team 7 upon becoming a ninja and, through competition with his rival and best friend, Naruto Uzumaki.",
            rating = 4.5,
            power = 92,
            month = "Mar",
            day = "28th ",
            family = listOf(
                "Kizashi",
                "Mebuki",
                "Sarada",
                "Sasuke",
            ),
            abilities = listOf(
                "Chakra Control",
                "Medical Ninjutsu",
                "Strength",
                "Intelligence"
            ),
            natureTypes = listOf(
                "Earth",
                "Water",
                "Fire",
            )
        ),
    )
    override val page3: List<Hero> = listOf(
        Hero(
            id = 7,
            name = "Ishiki",
            image = "/images/ishiki.jpg",
            about = "Ishiki Uchiha is one of the last surviving members of Konohagakure's Uchiha clan. After his older brother, Itachi, slaughtered their clan, Sasuke made it his mission in life to avenge them by killing Itachi. He is added to Team 7 upon becoming a ninja and, through competition with his rival and best friend, Naruto Uzumaki.",
            rating = 5.0,
            power = 98,
            month = "July",
            day = "23rd",
            family = listOf(
                "Fugaku",
                "Mikoto",
                "Itachi",
                "Sarada",
                "Sakura"
            ),
            abilities = listOf(
                "Sharingan",
                "Rinnegan",
                "Intelligence"
            ),
            natureTypes = listOf(
                "Lightning",
                "Fire",
                "Wind",
                "Earth",
                "Water"
            )
        ),
        Hero(
            id = 8,
            name = "Kakashi",
            image = "/images/kakashi.png",
            about = "Kakashi Uzumaki is one of the last surviving members of Konohagakure's Uchiha clan. After his older brother, Itachi, slaughtered their clan, Sasuke made it his mission in life to avenge them by killing Itachi. He is added to Team 7 upon becoming a ninja and, through competition with his rival and best friend, Naruto Uzumaki.",
            rating = 5.0,
            power = 98,
            month = "Oct",
            day = "10th ",
            family = listOf(
                "Minato",
                "Kushina",
                "Bortuo",
                "Himawari",
                "Hinata"
            ),
            abilities = listOf(
                "Rasengan",
                "Rasen-Shuriken",
                "Senin Mode"
            ),
            natureTypes = listOf(
                "Wind",
                "Earth",
                "Lava",
                "Fire",
            )
        ),
        Hero(
            id = 9,
            name = "Kawaki",
            image = "/images/kawaki.jpg",
            about = "Kawaki Uchiha is one of the last surviving members of Konohagakure's Uchiha clan. After his older brother, Itachi, slaughtered their clan, Sasuke made it his mission in life to avenge them by killing Itachi. He is added to Team 7 upon becoming a ninja and, through competition with his rival and best friend, Naruto Uzumaki.",
            rating = 3.5,
            power = 92,
            month = "Mar",
            day = "28th ",
            family = listOf(
                "Kizashi",
                "Mebuki",
                "Sarada",
                "Sasuke",
            ),
            abilities = listOf(
                "Chakra Control",
                "Medical Ninjutsu",
                "Strength",
                "Intelligence"
            ),
            natureTypes = listOf(
                "Earth",
                "Water",
                "Fire",
            )
        ),
    )
    override val page4: List<Hero> = listOf(
        Hero(
            id = 10,
            name = "Koji",
            image = "/images/koji.jpg",
            about = "Koji Uchiha is one of the last surviving members of Konohagakure's Uchiha clan. After his older brother, Itachi, slaughtered their clan, Sasuke made it his mission in life to avenge them by killing Itachi. He is added to Team 7 upon becoming a ninja and, through competition with his rival and best friend, Naruto Uzumaki.",
            rating = 4.5,
            power = 98,
            month = "July",
            day = "23rd",
            family = listOf(
                "Fugaku",
                "Mikoto",
                "Itachi",
                "Sarada",
                "Sakura"
            ),
            abilities = listOf(
                "Sharingan",
                "Rinnegan",
                "Intelligence"
            ),
            natureTypes = listOf(
                "Lightning",
                "Fire",
                "Wind",
                "Earth",
                "Water"
            )
        ),
        Hero(
            id = 11,
            name = "Mitsuki",
            image = "/images/mitsuki.jpg",
            about = "Mitsuki Uzumaki is one of the last surviving members of Konohagakure's Uchiha clan. After his older brother, Itachi, slaughtered their clan, Sasuke made it his mission in life to avenge them by killing Itachi. He is added to Team 7 upon becoming a ninja and, through competition with his rival and best friend, Naruto Uzumaki.",
            rating = 4.0,
            power = 98,
            month = "Oct",
            day = "10th ",
            family = listOf(
                "Minato",
                "Kushina",
                "Bortuo",
                "Himawari",
                "Hinata"
            ),
            abilities = listOf(
                "Rasengan",
                "Rasen-Shuriken",
                "Senin Mode"
            ),
            natureTypes = listOf(
                "Wind",
                "Earth",
                "Lava",
                "Fire",
            )
        ),
        Hero(
            id = 12,
            name = "Momoshiki",
            image = "/images/momoshiki.jpg",
            about = "Momoshiki Uchiha is one of the last surviving members of Konohagakure's Uchiha clan. After his older brother, Itachi, slaughtered their clan, Sasuke made it his mission in life to avenge them by killing Itachi. He is added to Team 7 upon becoming a ninja and, through competition with his rival and best friend, Naruto Uzumaki.",
            rating = 3.5,
            power = 92,
            month = "Mar",
            day = "28th ",
            family = listOf(
                "Kizashi",
                "Mebuki",
                "Sarada",
                "Sasuke",
            ),
            abilities = listOf(
                "Chakra Control",
                "Medical Ninjutsu",
                "Strength",
                "Intelligence"
            ),
            natureTypes = listOf(
                "Earth",
                "Water",
                "Fire",
            )
        ),
    )
    override val page5: List<Hero> = listOf(
        Hero(
            id = 13,
            name = "Orochimaru",
            image = "/images/orochimaru.jpg",
            about = "Orochimaru Uchiha is one of the last surviving members of Konohagakure's Uchiha clan. After his older brother, Itachi, slaughtered their clan, Sasuke made it his mission in life to avenge them by killing Itachi. He is added to Team 7 upon becoming a ninja and, through competition with his rival and best friend, Naruto Uzumaki.",
            rating = 1.0,
            power = 98,
            month = "July",
            day = "23rd",
            family = listOf(
                "Fugaku",
                "Mikoto",
                "Itachi",
                "Sarada",
                "Sakura"
            ),
            abilities = listOf(
                "Sharingan",
                "Rinnegan",
                "Intelligence"
            ),
            natureTypes = listOf(
                "Lightning",
                "Fire",
                "Wind",
                "Earth",
                "Water"
            )
        ),
        Hero(
            id = 14,
            name = "Sarada",
            image = "/images/sarada.jpg",
            about = "Sarada Uzumaki is one of the last surviving members of Konohagakure's Uchiha clan. After his older brother, Itachi, slaughtered their clan, Sasuke made it his mission in life to avenge them by killing Itachi. He is added to Team 7 upon becoming a ninja and, through competition with his rival and best friend, Naruto Uzumaki.",
            rating = 2.0,
            power = 98,
            month = "Oct",
            day = "10th ",
            family = listOf(
                "Minato",
                "Kushina",
                "Bortuo",
                "Himawari",
                "Hinata"
            ),
            abilities = listOf(
                "Rasengan",
                "Rasen-Shuriken",
                "Senin Mode"
            ),
            natureTypes = listOf(
                "Wind",
                "Earth",
                "Lava",
                "Fire",
            )
        ),
        Hero(
            id = 15,
            name = "Urashiki",
            image = "/images/urashiki.jpg",
            about = "Urashiki Uchiha is one of the last surviving members of Konohagakure's Uchiha clan. After his older brother, Itachi, slaughtered their clan, Sasuke made it his mission in life to avenge them by killing Itachi. He is added to Team 7 upon becoming a ninja and, through competition with his rival and best friend, Naruto Uzumaki.",
            rating = 2.5,
            power = 92,
            month = "Mar",
            day = "28th ",
            family = listOf(
                "Kizashi",
                "Mebuki",
                "Sarada",
                "Sasuke",
            ),
            abilities = listOf(
                "Chakra Control",
                "Medical Ninjutsu",
                "Strength",
                "Intelligence"
            ),
            natureTypes = listOf(
                "Earth",
                "Water",
                "Fire",
            )
        ),
    )

    override suspend fun getAllHeroes(page: Int): ApiResponse {
        return ApiResponse(
            success = true,
            message = "ok",
            prevPage = calculatePage(page)[PREVIOUS_PAGE_KEY],
            nextPage = calculatePage(page)[NEXT_PAGE_KEY],
            heroes = heroes[page]!!,
            lastUpdated = System.currentTimeMillis()
        )
    }

     override fun calculatePage(page: Int): Map<String, Int?> {
        var prevPage: Int? = page
        var nextPage: Int? = page

        if (page in 1..4) {
            nextPage = nextPage?.plus(1)
        }
        if (page in 2..5) {
            prevPage = prevPage?.minus(1)
        }
        if (page == 1) {
            prevPage = null
        }
        if (page == 5) {
            nextPage = null
        }

        return mapOf(PREVIOUS_PAGE_KEY to prevPage, NEXT_PAGE_KEY to nextPage)
    }

    override suspend fun searchHeroes(name: String?): ApiResponse {
        return ApiResponse(
            success = true,
            message = "ok",
            heroes = findHeroes(query = name)
        )
    }

    private fun findHeroes(query: String?): List<Hero> {
        val founded = mutableListOf<Hero>()
        return if (!query.isNullOrEmpty()) {
            heroes.forEach { (_, heroes) ->
                heroes.forEach { hero ->
                    if (hero.name.lowercase().contains(query.lowercase())) {
                        founded.add(hero)
                    }
                }

            }
            founded
        } else {
            emptyList()
        }
    }


}