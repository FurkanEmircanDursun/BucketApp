package com.example.furkan_emircan_dursun_vize2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ListView
import com.example.furkan_emircan_dursun_vize2.adapter.CustomAdapter
import com.example.furkan_emircan_dursun_vize2.config.ApiClient
import com.example.furkan_emircan_dursun_vize2.model.DummyProducts
import com.example.furkan_emircan_dursun_vize2.model.Product
import com.example.furkan_emircan_dursun_vize2.service.DummyService

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    lateinit var dummyService: DummyService
    lateinit var listView: ListView
    lateinit var myCardButton: Button
    lateinit var list: List<Product>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listView = findViewById(R.id.listView)
        myCardButton = findViewById(R.id.myCardButton)

        dummyService = ApiClient.getClient().create(DummyService::class.java)

        dummyService.products().enqueue(object : Callback<DummyProducts> {
            override fun onResponse(call: Call<DummyProducts>, response: Response<DummyProducts>) {
                val datas = response.body();
                list = datas!!.products
                val customAdapter = CustomAdapter(this@MainActivity, list)
                listView.adapter = customAdapter

            }

            override fun onFailure(call: Call<DummyProducts>, t: Throwable) {
      Log.d("error","servis hata")
            }
        })
        listView.setOnItemClickListener { adapterView, view, i, l ->
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("id", i+1)
            startActivity(intent)
        }
        myCardButton.setOnClickListener {

            intent=Intent(this,BaskedActivity::class.java)
            startActivity(intent)
        }
    }

}

