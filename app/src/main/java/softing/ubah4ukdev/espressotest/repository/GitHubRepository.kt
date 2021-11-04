package softing.ubah4ukdev.espressotest.repository

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import softing.ubah4ukdev.espressotest.model.SearchResponse
import softing.ubah4ukdev.espressotest.presenter.RepositoryContract

/**
 *   Project: EspressoTest
 *
 *   Package: softing.ubah4ukdev.espressotest.repository
 *
 *   Created by Ivan Sheynmaer
 *
 *   Description:
 *
 *
 *   2021.11.04
 *
 *   v1.0
 */
internal class GitHubRepository(private val gitHubApi: GitHubApi) : RepositoryContract {

    override fun searchGithub(
        query: String,
        callback: RepositoryCallback
    ) {
        val call = gitHubApi.searchGithub(query)
        call?.enqueue(object : Callback<SearchResponse?> {

            override fun onResponse(
                call: Call<SearchResponse?>,
                response: Response<SearchResponse?>
            ) {
                callback.handleGitHubResponse(response)
            }

            override fun onFailure(
                call: Call<SearchResponse?>,
                t: Throwable
            ) {
                callback.handleGitHubError()
            }
        })
    }
}