package com.brl.pokedexapp.data.model

import com.brl.pokedexapp.domain.model.PokemonItem

data class PokemonItemResponse(
    val name: String,
    val url: String
)

fun PokemonItemResponse.toPokemonItem() = PokemonItem(
        name = this.name,
        url = this.url
)
