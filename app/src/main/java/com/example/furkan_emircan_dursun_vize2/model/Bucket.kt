package com.example.furkan_emircan_dursun_vize2.model

data class Bucket (
    val id: Long,
    val title: String,
    val price: Long,
    val quantity: Long,
    val total: Long,
    val discountPercentage: Double,
    val discountedPrice: Long
)
