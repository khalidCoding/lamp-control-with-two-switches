package com.khalidcoding.elicandprog.pojo

import android.widget.ImageView

/**
 * Created by KHALID EL MRABTI&Khalid Coding on 02/06/20.
 * Lamp control with two switches an android application made using android studio and kotlin
 */

abstract class Switch(){

    var up = false
    var down = false

    abstract fun setSwitchUp(img:ImageView)
    abstract fun setSwitchDown(img: ImageView)
    abstract fun setSwitchStat()
    abstract fun getSwitchStat():Boolean


}