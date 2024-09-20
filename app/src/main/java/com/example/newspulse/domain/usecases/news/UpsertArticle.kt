package com.example.newspulse.domain.usecases.news

import com.example.newspulse.data.local.NewsDao
import com.example.newspulse.domain.model.Article
import javax.inject.Inject

class UpsertArticle @Inject constructor(
    private val newsDao: NewsDao
) {

    suspend operator fun invoke(article: Article){
        newsDao.upsert(article = article)
    }

}