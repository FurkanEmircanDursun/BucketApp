package com.example.furkan_emircan_dursun_vize2.adapter

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.example.furkan_emircan_dursun_vize2.R
import com.example.furkan_emircan_dursun_vize2.model.Bucket
import com.example.furkan_emircan_dursun_vize2.model.Product


class BucketAdapter(private val context: Activity, private val list: List<Bucket>) :
    ArrayAdapter<Bucket>(
        context,
        R.layout.list_item, list
    ) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val rootView = context.layoutInflater.inflate(R.layout.list_item, null, true)

        val name = rootView.findViewById<TextView>(R.id.titleTextView)
        val price = rootView.findViewById<TextView>(R.id.priceTextView)

        val product = list.get(position)
        name.text = product.title
        price.text = product.price.toString()

        return rootView
    }
}