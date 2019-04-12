package com.latihan.quickcount

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object DataRepository {

    fun create(): PostService {
        val retrofit = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("https://api.myjson.com/bins/uzqmy")
                .build()
        return retrofit.create(PostService::class.java)
    }
}