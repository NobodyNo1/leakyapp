package com.leaky.amankeldi.leakyapplication.activities.testleak.presenter

import android.os.AsyncTask
import android.os.Handler
import android.util.Log
import com.leaky.amankeldi.leakyapplication.activities.testleak.model.TestData

private const val THRESHOLD = 1000L
private const val MAX_ROW = 4

class DbWorker(
    private val callback: Callback
) : AsyncTask<Void, Int, TestData>() {

    private val TAG = DbWorker::class.java.simpleName

    override fun doInBackground(vararg params: Void?): TestData {
        Log.d(TAG,"Started")
        return startCleningRow()
    }

    override fun onCancelled() {
        Log.d(TAG,"Cancelled")
        super.onCancelled()
    }

    override fun onPostExecute(result: TestData?) {
        Log.d(TAG,"Finished")
        super.onPostExecute(result)
        callback.onFinish(result)
    }

    override fun onProgressUpdate(vararg values: Int?) {
        super.onProgressUpdate(*values)
        Log.d(TAG, "progress: " + values[0])
    }

    private fun startCleningRow():TestData {
        for (i in 0..MAX_ROW) {
            onProgressUpdate(i)
            Thread.sleep(1000)
        }
        return TestData(0)
    }

    interface Callback{

        fun onFinish(data: TestData?)
    }
}
