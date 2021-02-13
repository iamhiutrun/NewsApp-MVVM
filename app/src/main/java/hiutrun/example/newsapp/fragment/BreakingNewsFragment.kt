package hiutrun.example.newsapp.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import hiutrun.example.newsapp.R
import hiutrun.example.newsapp.ui.NewsActivity
import hiutrun.example.newsapp.ui.NewsViewModel

class BreakingNewsFragment : Fragment(R.layout.fragment_breaking_news) {
    lateinit var viewModel:NewsViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = (activity as NewsActivity).viewModel
    }

}