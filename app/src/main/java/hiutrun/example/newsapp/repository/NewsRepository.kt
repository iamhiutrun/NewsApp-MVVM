package hiutrun.example.newsapp.repository

import hiutrun.example.newsapp.api.RetrofitInstance
import hiutrun.example.newsapp.db.ArticleDatabase

class NewsRepository(
        val db:ArticleDatabase
) {
    suspend fun getBreakingNews(country:String,pageNumber:Int) =
            RetrofitInstance.api.getBreakingNews(country,pageNumber)

    suspend fun searchNews(searchQuery: String,pageNumber: Int) =
            RetrofitInstance.api.searchForNews(searchQuery,pageNumber)
}