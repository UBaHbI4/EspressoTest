package softing.ubah4ukdev.espressotest.presenter.details

import softing.ubah4ukdev.espressotest.presenter.PresenterContract

/**
 *   Project: EspressoTest
 *
 *   Package: softing.ubah4ukdev.espressotest.presenter.details
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
internal interface PresenterDetailsContract : PresenterContract {
    fun setCounter(count: Int)
    fun onIncrement()
    fun onDecrement()
}