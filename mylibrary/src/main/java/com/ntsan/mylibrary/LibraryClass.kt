package com.ntsan.mylibrary

import com.ntsan.androidlib.AndroidClass
import com.ntsan.kotlinlib.KotlinClass

class LibraryClass(val libValue: String){
    init {
        AndroidClass()
        KotlinClass()
    }
}