package hiutrun.example.newsapp.ui

import androidx.lifecycle.ViewModel
import hiutrun.example.newsapp.repository.NewsRepository

class NewsViewModel(
        val newsRepository: NewsRepository
) : ViewModel() {
}


