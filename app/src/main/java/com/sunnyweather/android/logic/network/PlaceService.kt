package com.sunnyweather.android.logic.network

import com.sunnyweather.android.SunnyWeatherApplication
import com.sunnyweather.android.logic.model.PlaceResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

//接口请求，对接API
interface PlaceService {
    @GET("v2/place?token=${SunnyWeatherApplication.TOKEN}&lang=zh_CN")//GET中需要传入三个具体参数，query即地址使用@Query进行添加，其他两个参数写死（注意是相对路径，根路径之后统一设置
    fun searchPlaces(@Query("query") query: String): Call<PlaceResponse>
}