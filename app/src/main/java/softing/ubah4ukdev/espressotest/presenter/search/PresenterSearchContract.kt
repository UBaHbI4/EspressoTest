package softing.ubah4ukdev.espressotest.presenter.search

import softing.ubah4ukdev.espressotest.presenter.PresenterContract

/**
 *   Project: EspressoTest
 *
 *   Package: softing.ubah4ukdev.espressotest.presenter.search
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
internal interface PresenterSearchContract : PresenterContract {
    fun searchGitHub(searchQuery: String)
}