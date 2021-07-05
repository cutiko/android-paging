package com.example.android.codelabs.paging.ui

import androidx.paging.ExperimentalPagingApi
import androidx.paging.LoadType
import androidx.paging.PagingState
import androidx.paging.RemoteMediator
import com.example.android.codelabs.paging.api.GithubService
import com.example.android.codelabs.paging.model.Repo

@OptIn(ExperimentalPagingApi::class)
class GithubRemoteMediator(
    /*private val query: String,
    private val service: GithubService*/
) : RemoteMediator<Int, Repo>() {

    override suspend fun load(loadType: LoadType, state: PagingState<Int, Repo>): MediatorResult {
        TODO("not implemented un purpose to test the Pager class")
    }
}