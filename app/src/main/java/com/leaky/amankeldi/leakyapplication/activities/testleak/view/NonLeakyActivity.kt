package com.leaky.amankeldi.leakyapplication.activities.testleak.view

import com.leaky.amankeldi.leakyapplication.activities.testleak.presenter.nonleaky.NonLeakyPresenter
import com.leaky.amankeldi.leakyapplication.activities.testleak.presenter.nonleaky.NonLeakyPresenterImpl

class NonLeakyActivity : BaseActivity() {

    val presenter: NonLeakyPresenter = NonLeakyPresenterImpl()

    override fun onResume() {
        super.onResume()
        presenter.onAttach(this)
    }

    override fun onBtnClicked() {
        super.onBtnClicked()
        presenter.doWork()
    }

    override fun onPause() {
        super.onPause()
        presenter.onDetach()
    }
}
