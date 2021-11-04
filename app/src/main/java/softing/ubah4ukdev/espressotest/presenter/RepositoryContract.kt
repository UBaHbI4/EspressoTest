package softing.ubah4ukdev.espressotest.presenter

import softing.ubah4ukdev.espressotest.repository.RepositoryCallback

/**
 *   Project: EspressoTest
 *
 *   Package: softing.ubah4ukdev.espressotest.presenter
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
internal interface RepositoryContract {
    fun searchGithub(
        query: String,
        callback: RepositoryCallback
    )
}