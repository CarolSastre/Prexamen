package com.example.prexamen.data.model

data class Photo (
    val id: Int,
    val title: String,
    val description: String,
    val url: String? = null,
    val thumbnailURL: String? = null
)