package com.leaky.amankeldi.leakyapplication.activities.testleak.presenter.nonleaky

import com.leaky.amankeldi.leakyapplication.activities.testleak.presenter.EmptyMainView
import com.leaky.amankeldi.leakyapplication.activities.testleak.presenter.MainPresenterImpl
import com.leaky.amankeldi.leakyapplication.activities.testleak.view.MainView

class NonLeakyPresenterImpl: MainPresenterImpl(), NonLeakyPresenter {
    override fun onAttach(view: MainView) {
        mainView = view
    }

    override fun onDetach() {
        mainView = EmptyMainView()
    }
}