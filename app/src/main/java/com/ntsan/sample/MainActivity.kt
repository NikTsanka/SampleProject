package com.ntsan.sample

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.ntsan.androidlib.AndroidClass
import com.ntsan.kotlinlib.KotlinClass
import com.ntsan.mylibrary.LibraryClass

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        log("onCreate")
        setContentView(R.layout.activity_main)
    }

    val androidClass = AndroidClass()
    val kotlinClass = KotlinClass()
    val libraryClass = LibraryClass("string")

    private fun log(msg: String) {
        Log.d("Activity Lifecycle", msg)
    }

    override fun onStart() {
        super.onStart()
        log("onStart")
    }

    override fun onRestart() {
        super.onRestart()
        log("onRestart")
    }

    override fun onResume() {
        super.onResume()
        log("onResume")
    }

    override fun onPause() {
        super.onPause()
        log("onPause")
    }

    override fun onStop() {
        super.onStop()
        log("onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        log("onDestroy")
    }
}