package com.leaky.amankeldi.leakyapplication.activities.testleak.presenter.leaky

import com.leaky.amankeldi.leakyapplication.activities.testleak.presenter.MainPresenterImpl
import com.leaky.amankeldi.leakyapplication.activities.testleak.view.MainView

class LeakyPresenterImpl: MainPresenterImpl(), LeakyPresenter{

    override fun setView(view: MainView) {
        this.mainView= view;
    }
}