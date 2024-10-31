package com.github.art5hur.cryptomonitor.service

import com.github.art5hur.cryptomonitor.model.TickerResponse
import retrofit2.Response
import retrofit2.http.GET
interface MercadoBitcoinService {
    @GET("api/BTC/ticker/")
    suspend fun getTicker(): Response<TickerResponse>
}