package com.example.jetpackdemo2

import androidx.lifecycle.ViewModel

class MainViewModel(countReserved: Int): ViewModel() {
    var count = countReserved
}