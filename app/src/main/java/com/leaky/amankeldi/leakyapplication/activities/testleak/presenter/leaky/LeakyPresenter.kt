package com.leaky.amankeldi.leakyapplication.activities.testleak.presenter.leaky

import com.leaky.amankeldi.leakyapplication.activities.testleak.presenter.MainPresenter
import com.leaky.amankeldi.leakyapplication.activities.testleak.view.MainView

interface LeakyPresenter : MainPresenter {

    fun setView(view: MainView)
}