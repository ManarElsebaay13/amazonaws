package com.manarelsebaay13.amazonaws.domain.model

import java.io.Serializable

data class Product(
    val uid: String,
    val name: String,
    val price: String,
    val imageUrlsThumbnails: List<String>,
    val imageUrls: List<String>,
    val createdAt: String,
    ): Serializable