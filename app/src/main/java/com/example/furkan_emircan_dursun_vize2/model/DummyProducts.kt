package com.example.furkan_emircan_dursun_vize2.model

data class DummyProducts (
    val products: List<Product>,
    val total: Long,
    val skip: Long,
    val limit: Long
)