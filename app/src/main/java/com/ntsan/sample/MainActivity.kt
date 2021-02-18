package com.ntsan.sample

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.ntsan.androidlib.AndroidClass
import com.ntsan.kotlinlib.KotlinClass

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        log("onCreate ${AndroidClass().testValue} ${KotlinClass().testValue}")
        setContentView(R.layout.activity_main)
    }

//    private val callAndroidShowMethod = AndroidClass().show("String, string, string.")
//    private val callKtShowMethod = KotlinClass().show("String, string, string.")


    private fun log(msg: String) {
        Log.d("Activity Lifecycle", msg)
    }

   /* override fun finish() {
        super.finish()
    }*/

    override fun onStart() {
        super.onStart()
        log("onStart ${KotlinClass().testValue}")
    }

    override fun onRestart() {
        super.onRestart()
        log("onRestart ${AndroidClass().testValue}")
    }

    override fun onResume() {
        super.onResume()
        log("onResume ${KotlinClass().testValue}")
    }

    override fun onPause() {
        super.onPause()
        log("onPause ${AndroidClass().testValue}")
    }

    override fun onStop() {
        super.onStop()
        log("onStop ${KotlinClass().testValue}")
    }

    override fun onDestroy() {
        super.onDestroy()
        log("onDestroy ${AndroidClass().testValue}")
    }
}