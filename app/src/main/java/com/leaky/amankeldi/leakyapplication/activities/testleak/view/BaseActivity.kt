package com.leaky.amankeldi.leakyapplication.activities.testleak.view

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.Toast
import com.leaky.amankeldi.leakyapplication.R
import com.leaky.amankeldi.leakyapplication.activities.testleak.model.TestData

abstract class BaseActivity : AppCompatActivity(), MainView {

    val tmpData: String = "Data came back"

    override fun onResult(data: TestData) {
        showData()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.btn_start_work).setOnClickListener(
            {
                findViewById<Button>(R.id.btn_start_work).text = "Started"
                it.isEnabled = false
                onBtnClicked()
            }
        )
    }

    open fun onBtnClicked(){

    }

    fun showData(){
        Toast.makeText(
            this,
            tmpData,
            Toast.LENGTH_SHORT)
            .show()
        findViewById<Button>(R.id.btn_start_work).isEnabled = true
        findViewById<Button>(R.id.btn_start_work).text = "Click again"
    }
}