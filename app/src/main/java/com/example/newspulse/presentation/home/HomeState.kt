package com.example.newspulse.presentation.home


data class HomeState(
    val newsTicker: String = "",
    val isLoading: Boolean = false,
)