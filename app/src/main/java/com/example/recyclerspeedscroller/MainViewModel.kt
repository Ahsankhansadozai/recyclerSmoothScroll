package com.example.recyclerspeedscroller

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private var mCOunt = 1000
    private val observeCount: MutableLiveData<Int> = MutableLiveData()

    init {
        postCount()
    }

    fun incSpeed() {
        mCOunt += 500
        Log.d("Vm ahsan", mCOunt.toString())
        postCount()
    }

    private fun postCount() {
        observeCount.postValue(mCOunt)
    }

    fun disSpeed() {
            mCOunt - 500
            postCount()
    }

    fun observeCount(): MutableLiveData<Int> = observeCount


}