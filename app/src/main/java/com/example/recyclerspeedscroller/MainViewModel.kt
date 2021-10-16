package com.example.recyclerspeedscroller

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private var mCOunt = 1000
    private val observeCount: MutableLiveData<Int> = MutableLiveData()

    fun incSpeed() {
        mCOunt += 1000
        Log.d("Vm ahsan", mCOunt.toString())
        postCount()
    }

    private fun postCount() {
        observeCount.postValue(mCOunt)
    }

    fun disSpeed() {

        if (mCOunt > 1000) {
            mCOunt - 1000
            postCount()
        }


    }

    fun observeCount(): MutableLiveData<Int> = observeCount


}