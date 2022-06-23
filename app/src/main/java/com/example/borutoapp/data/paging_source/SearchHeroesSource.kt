package com.example.borutoapp.data.paging_source

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.example.borutoapp.domain.model.Hero

class SearchHeroesSource: PagingSource<Int, Hero>() {
    override fun getRefreshKey(state: PagingState<Int, Hero>): Int? {
        TODO("Not yet implemented")
    }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Hero> {
        TODO("Not yet implemented")
    }
}