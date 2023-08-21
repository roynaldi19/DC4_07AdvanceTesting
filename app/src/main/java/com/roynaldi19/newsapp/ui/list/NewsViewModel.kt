package com.roynaldi19.newsapp.ui.list

import androidx.lifecycle.ViewModel
import com.roynaldi19.newsapp.data.NewsRepository

class NewsViewModel(private val newsRepository: NewsRepository) : ViewModel() {
    fun getHeadlineNews() = newsRepository.getHeadlineNews()

    fun getBookmarkedNews() = newsRepository.getBookmarkedNews()
}