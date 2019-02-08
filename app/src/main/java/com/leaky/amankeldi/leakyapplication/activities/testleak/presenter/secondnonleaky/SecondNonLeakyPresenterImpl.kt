package com.leaky.amankeldi.leakyapplication.activities.testleak.presenter.secondnonleaky

import com.leaky.amankeldi.leakyapplication.activities.testleak.presenter.EmptyMainView
import com.leaky.amankeldi.leakyapplication.activities.testleak.presenter.MainPresenterImpl
import com.leaky.amankeldi.leakyapplication.activities.testleak.presenter.nonleaky.NonLeakyPresenter
import com.leaky.amankeldi.leakyapplication.activities.testleak.view.MainView

class SecondNonLeakyPresenterImpl: MainPresenterImpl(), NonLeakyPresenter {
    override fun onAttach(view: MainView) {
        mainView = view
    }

    override fun onDetach() {
        mainView = EmptyMainView()
        dbWorker?.cancel(true)
    }
}