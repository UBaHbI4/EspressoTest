package softing.ubah4ukdev.espressotest.repository

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
internal class FakeGitHubRepository : RepositoryContract {

    override fun searchGithub(
        query: String,
        callback: RepositoryCallback
    ) {
        callback.handleGitHubResponse(Response.success(SearchResponse(42, listOf())))
    }
}