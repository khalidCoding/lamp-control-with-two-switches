package com.khalidcoding.elicandprog.pojo

import android.widget.ImageView
import com.khalidcoding.elicandprog.R
/**
 * Created by KHALID EL MRABTI&Khalid Coding on 02/06/20.
 * Lamp control with two switches an android application made using android studio and kotlin
 */
class Lamp : LampState {

    var on = false
    var off = false
    private var currentStat = true

     fun turnOn(img : ImageView){
            img.setImageResource(R.drawable.on)
    }

     fun turnOff(img : ImageView){
            img.setImageResource(R.drawable.off)
    }

    override fun setLampStat() {

        if(currentStat==on){
            on = false
            off = true
            currentStat = off
        }else if (currentStat==off){
            on = true
            off = false
            currentStat = on
        }
    }

    override fun getLampStat() :Boolean {
        return currentStat
    }


}