package com.leaky.amankeldi.leakyapplication.activities.testleak.presenter

import com.leaky.amankeldi.leakyapplication.activities.testleak.model.TestData
import com.leaky.amankeldi.leakyapplication.activities.testleak.view.MainView

class EmptyMainView: MainView{
    override fun onResult(data: TestData) {}
}