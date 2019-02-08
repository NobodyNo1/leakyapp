package com.leaky.amankeldi.leakyapplication.activities.testleak.view

import com.leaky.amankeldi.leakyapplication.activities.testleak.presenter.nonleaky.NonLeakyPresenter
import com.leaky.amankeldi.leakyapplication.activities.testleak.presenter.secondnonleaky.SecondNonLeakyPresenterImpl

class SecondNonLeakyActivity : BaseActivity() {

    val presenter: NonLeakyPresenter = SecondNonLeakyPresenterImpl()

    override fun onBtnClicked() {
        super.onBtnClicked()
        presenter.doWork()
    }

    override fun onResume() {
        super.onResume()
        presenter.onAttach(this)
    }

    override fun onPause() {
        super.onPause()
        presenter.onDetach()
    }
}
