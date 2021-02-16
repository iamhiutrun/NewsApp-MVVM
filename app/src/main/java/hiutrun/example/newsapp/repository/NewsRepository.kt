package hiutrun.example.newsapp.repository

import hiutrun.example.newsapp.api.RetrofitInstance
import hiutrun.example.newsapp.db.ArticleDatabase
import hiutrun.example.newsapp.models.Article

class NewsRepository(
        val db:ArticleDatabase
) {
    suspend fun getBreakingNews(country:String,pageNumber:Int) =
            RetrofitInstance.api.getBreakingNews(country,pageNumber)

    suspend fun searchNews(searchQuery: String,pageNumber: Int) =
            RetrofitInstance.api.searchForNews(searchQuery,pageNumber)

    suspend fun upsert(article: Article) = db.getArticleDao().upsert(article)

    fun getSavedNews() = db.getArticleDao().getAllArticles()

    suspend fun deleteArticle(article: Article) = db.getArticleDao().deleteArticle(article)
}