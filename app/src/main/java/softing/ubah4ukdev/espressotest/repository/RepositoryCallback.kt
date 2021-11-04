package softing.ubah4ukdev.espressotest.repository

import retrofit2.Response
import softing.ubah4ukdev.espressotest.model.SearchResponse

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
interface RepositoryCallback {
    fun handleGitHubResponse(response: Response<SearchResponse?>?)
    fun handleGitHubError()
}