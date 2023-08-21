package com.roynaldi19.newsapp.di

import android.content.Context
import com.roynaldi19.newsapp.data.NewsRepository
import com.roynaldi19.newsapp.data.local.room.NewsDatabase
import com.roynaldi19.newsapp.data.remote.retrofit.ApiConfig

object Injection {
    fun provideRepository(context: Context): NewsRepository {
        val apiService = ApiConfig.getApiService()
        val database = NewsDatabase.getInstance(context)
        val dao = database.newsDao()
        return NewsRepository.getInstance(apiService, dao)
    }
}