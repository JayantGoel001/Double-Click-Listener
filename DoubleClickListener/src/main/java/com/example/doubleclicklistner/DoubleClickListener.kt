package com.example.doubleclicklistner

import android.view.View

class DoubleClickListener(private val callback: setOnDoubleClickListener, private val doubleClickTimeLimit:Long=1000) :
    View.OnClickListener {
    private var lastClicked:Long = -1L
    override fun onClick(v: View?) {
        lastClicked = when{
            lastClicked == -1L ->{
                System.currentTimeMillis()
            }
            isDoubleClicked()->{
                callback.doubleClicked()
                -1L
            }
            else->{
                System.currentTimeMillis()
            }

        }
    }
    private fun getTimeDifference(from:Long,to:Long):Long{
        return  to-from
    }
    private fun isDoubleClicked():Boolean{
        return getTimeDifference(lastClicked,System.currentTimeMillis())<=doubleClickTimeLimit
    }
    interface setOnDoubleClickListener{
        fun doubleClicked()
    }




}