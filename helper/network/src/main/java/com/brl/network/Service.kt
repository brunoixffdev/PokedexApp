package com.brl.network

import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

private const val BASE_URL = "https://pokeapi.co/api/v2/"

class Service {
    private val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(MoshiConverterFactory.create())
        .build()

    fun <API> createService(apiClass: Class<API>):API{
        return retrofit.create(apiClass)
    }
}