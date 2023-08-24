package com.roynaldi19.newsapp.data

import com.roynaldi19.newsapp.data.remote.response.NewsResponse
import com.roynaldi19.newsapp.data.remote.retrofit.ApiService
import com.roynaldi19.newsapp.utils.DataDummy

class FakeApiService : ApiService {
    private val dummyResponse = DataDummy.generateDummyNewsResponse()
    override suspend fun getNews(apiKey: String): NewsResponse {
        return dummyResponse
    }
}