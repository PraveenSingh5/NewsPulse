package com.example.newspulse.data.remote.dto

import com.example.newspulse.domain.model.Article

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)