package com.leaky.amankeldi.leakyapplication.activities.testleak.presenter.nonleaky

import com.leaky.amankeldi.leakyapplication.activities.testleak.presenter.MainPresenter
import com.leaky.amankeldi.leakyapplication.activities.testleak.view.MainView

interface NonLeakyPresenter: MainPresenter {

    fun onAttach(view: MainView)

    fun onDetach()
}