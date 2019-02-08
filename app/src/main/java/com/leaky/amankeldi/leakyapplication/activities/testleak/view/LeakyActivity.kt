package com.leaky.amankeldi.leakyapplication.activities.testleak.view

import android.os.Bundle
import com.leaky.amankeldi.leakyapplication.activities.testleak.presenter.leaky.LeakyPresenter
import com.leaky.amankeldi.leakyapplication.activities.testleak.presenter.leaky.LeakyPresenterImpl

class LeakyActivity : BaseActivity() {

    val presenter: LeakyPresenter = LeakyPresenterImpl()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter.setView(this)
    }

    override fun onBtnClicked() {
        super.onBtnClicked()
        presenter.doWork()
    }

}
