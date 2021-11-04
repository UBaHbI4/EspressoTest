package softing.ubah4ukdev.espressotest.view.search

import softing.ubah4ukdev.espressotest.model.SearchResult
import softing.ubah4ukdev.espressotest.view.ViewContract

/**
 *   Project: EspressoTest
 *
 *   Package: softing.ubah4ukdev.espressotest.view.search
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
internal interface ViewSearchContract : ViewContract {
    fun displaySearchResults(
        searchResults: List<SearchResult>,
        totalCount: Int
    )

    fun displayError()
    fun displayError(error: String)
    fun displayLoading(show: Boolean)
}