package softing.ubah4ukdev.espressotest.repository

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query
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
/**
 * Документация https://developer.github.com/v3/search/
 */

internal interface GitHubApi {

    @Headers("Accept: application/vnd.github.mercy-preview+json")
    @GET("search/repositories")
    fun searchGithub(@Query("q") term: String?): Call<SearchResponse?>?
}