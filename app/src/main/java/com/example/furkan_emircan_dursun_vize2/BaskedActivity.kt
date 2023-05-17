package com.example.furkan_emircan_dursun_vize2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.example.furkan_emircan_dursun_vize2.adapter.BucketAdapter
import com.example.furkan_emircan_dursun_vize2.config.ApiClient
import com.example.furkan_emircan_dursun_vize2.model.Buckets
import com.example.furkan_emircan_dursun_vize2.service.DummyService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class BaskedActivity : AppCompatActivity() {
    lateinit var  listView:ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_basked)

    listView = findViewById(R.id.listView)

       var dummyService = ApiClient.getClient().create(DummyService::class.java)

        dummyService.getCart().enqueue(object : Callback<Buckets> {
            override fun onResponse(call: Call<Buckets>, response: Response<Buckets>) {
                val datas = response.body()
                val list = datas!!.products
                val customAdapter = BucketAdapter(this@BaskedActivity, list)
                listView.adapter = customAdapter


            }

            override fun onFailure(call: Call<Buckets>, t: Throwable) {
                TODO("Not yet implemented")
            }


        })
    }
}