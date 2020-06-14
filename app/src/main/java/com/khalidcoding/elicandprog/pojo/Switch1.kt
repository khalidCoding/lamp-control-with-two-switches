package com.khalidcoding.elicandprog.pojo

import android.widget.ImageView
import com.khalidcoding.elicandprog.R

/**
 * Created by KHALID EL MRABTI&Khalid Coding on 02/06/20.
 * Lamp control with two switches an android application made using android studio and kotlin
 */

open class Switch1 : Switch() {

    private var currentState = true

    override fun setSwitchUp(img: ImageView) {
        img.setImageResource(R.drawable.up)
    }

    override fun setSwitchDown(img: ImageView) {
        img.setImageResource(R.drawable.down)
    }

    override fun setSwitchStat() {
        if (currentState==this.up){
            this.up = false
            this.down = true
            currentState = this.down
        }else if(currentState==this.down){
            this.up = true
            this.down = false
            currentState = this.up
        }
    }

    override fun getSwitchStat():Boolean{
         return currentState
    }
}