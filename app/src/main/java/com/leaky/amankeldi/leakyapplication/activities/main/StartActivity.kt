package com.leaky.amankeldi.leakyapplication.activities.main

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity;
import android.view.View
import android.widget.Button
import com.leaky.amankeldi.leakyapplication.R
import com.leaky.amankeldi.leakyapplication.activities.TestModel
import com.leaky.amankeldi.leakyapplication.activities.testleak.view.LeakyActivity
import com.leaky.amankeldi.leakyapplication.activities.testleak.view.NonLeakyActivity
import com.leaky.amankeldi.leakyapplication.activities.testleak.view.SecondNonLeakyActivity

import kotlinx.android.synthetic.main.activity_start.*
import kotlin.reflect.KClass

class StartActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)
        setSupportActionBar(toolbar)
        setListerner(findViewById<Button>(R.id.btn_leaky_activity))
        setListerner(findViewById<Button>(R.id.btn_non_leaky_activity))
        setListerner(findViewById<Button>(R.id.btn_second_non_leaky_activity))

        val test = TestModel()
    }

    override fun onClick(v: View?) = when (v?.id) {
        R.id.btn_leaky_activity -> {
            openActivitgy(LeakyActivity::class.java)
        }
        R.id.btn_non_leaky_activity -> {
            openActivitgy(NonLeakyActivity::class.java)
        }
        R.id.btn_second_non_leaky_activity -> {
            openActivitgy(SecondNonLeakyActivity::class.java)
        }
        else -> {
        }
    }

    private fun setListerner(view: View) {
        view.setOnClickListener(this)
    }

    private fun openActivitgy(actClass: Class<*>){
        val intent = Intent(this, actClass);
        startActivity(intent)
    }
}
