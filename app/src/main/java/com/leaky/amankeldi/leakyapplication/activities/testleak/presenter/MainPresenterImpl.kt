package com.leaky.amankeldi.leakyapplication.activities.testleak.presenter

import com.leaky.amankeldi.leakyapplication.activities.testleak.model.TestData
import com.leaky.amankeldi.leakyapplication.activities.testleak.view.MainView

open class MainPresenterImpl : MainPresenter {

    private val callback = object : DbWorker.Callback {
        override fun onFinish(data: TestData?) {
            data?.let {
                cleanFinished(data)
            }
        }
    }

    protected var dbWorker: DbWorker? = null

    protected lateinit var mainView: MainView

    open fun cleanFinished(data: TestData) {
        mainView.onResult(data)
        dbWorker = null
    }

    override fun doWork() {
        if (dbWorker == null) {
            dbWorker = DbWorker(callback)
            dbWorker?.execute()
        }
    }
}