package com.example.furkan_emircan_dursun_vize2.service

import com.example.furkan_emircan_dursun_vize2.model.Buckets
import com.example.furkan_emircan_dursun_vize2.model.CartProduct
import com.example.furkan_emircan_dursun_vize2.model.CartProducts
import com.example.furkan_emircan_dursun_vize2.model.DummyProducts
import com.example.furkan_emircan_dursun_vize2.model.Product
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface DummyService {



    @GET("products")
    fun products() : Call<DummyProducts>

    @GET("products/{id}")
    fun singleProduct( @Path("id") id: Int ) : Call<Product>

    @POST("carts/add")
    fun postProduct(@Body cartProducts: CartProducts):Call<CartProducts>

    @GET("carts/1")
    fun getCart(): Call<Buckets>

}