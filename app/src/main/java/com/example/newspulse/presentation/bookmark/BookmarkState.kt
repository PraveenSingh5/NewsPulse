package com.example.newspulse.presentation.bookmark

import com.example.newspulse.domain.model.Article


data class BookmarkState(
    val articles: List<Article> = emptyList()
)