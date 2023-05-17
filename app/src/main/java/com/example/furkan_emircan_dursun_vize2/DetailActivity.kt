package com.example.furkan_emircan_dursun_vize2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.example.furkan_emircan_dursun_vize2.config.ApiClient
import com.example.furkan_emircan_dursun_vize2.model.CartProduct
import com.example.furkan_emircan_dursun_vize2.model.CartProducts
import com.example.furkan_emircan_dursun_vize2.model.Product
import com.example.furkan_emircan_dursun_vize2.service.DummyService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class DetailActivity : AppCompatActivity() {
    lateinit var dummyService: DummyService
    lateinit var productNameTextView: TextView
    lateinit var priceTextView: TextView
    lateinit var imageView: ImageView
    lateinit var addButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        dummyService = ApiClient.getClient().create(DummyService::class.java)

        productNameTextView = findViewById(R.id.productNameTextView)
        priceTextView = findViewById(R.id.priceTextView)
        imageView = findViewById(R.id.imageView)

        addButton = findViewById(R.id.addButton)
        var id = intent.getIntExtra("id", 1)


        dummyService.singleProduct(id).enqueue(object : Callback<Product> {
            override fun onResponse(call: Call<Product>, response: Response<Product>) {

                val data = response.body();
                productNameTextView.setText(data!!.title)
                priceTextView.setText(data.price.toString())
                Glide.with(this@DetailActivity).load(data.images[0]).into(imageView)


            }

            override fun onFailure(call: Call<Product>, t: Throwable) {


            }

        })



        addButton.setOnClickListener {



            var cartProducts=CartProducts(userId = 1, listOf(CartProduct(id,1)))


            dummyService.postProduct(cartProducts).enqueue(object:Callback<CartProducts> {
                override fun onResponse(
                    call: Call<CartProducts>,
                    response: Response<CartProducts>
                ) {
                    Log.d("test",response.toString())
                finish()
                }

                override fun onFailure(call: Call<CartProducts>, t: Throwable) {

                }


            })


        }
    }


}