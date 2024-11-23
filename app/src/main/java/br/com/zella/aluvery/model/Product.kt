package br.com.zella.aluvery.model

import java.math.BigDecimal

data class Product(
    val name: String,
    val price: BigDecimal,
    val description: String? = null,
    val image: String? = null
)