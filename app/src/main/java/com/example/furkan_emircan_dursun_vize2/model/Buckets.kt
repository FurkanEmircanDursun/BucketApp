package com.example.furkan_emircan_dursun_vize2.model

data class Buckets (
    val id: Long,
    val products: List<Bucket>,
    val total: Long,
    val discountedTotal: Long,


    val userId: Long,

    val totalProducts: Long,
    val totalQuantity: Long
)
