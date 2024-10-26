package com.example.newspulse.domain.usecases.news

import com.example.newspulse.data.local.NewsDao
import com.example.newspulse.domain.model.Article

import javax.inject.Inject

class GetSavedArticle @Inject constructor(
    private val newsDao: NewsDao
) {

    suspend operator fun invoke(url: String): Article?{
        return newsDao.getArticle(url = url)
    }

}