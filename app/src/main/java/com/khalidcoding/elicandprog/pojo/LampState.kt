package com.khalidcoding.elicandprog.pojo

/**
 * Created by KHALID EL MRABTI&Khalid Coding on 02/06/20.
 * Lamp control with two switches an android application made using android studio and kotlin
 */

interface LampState {
    fun setLampStat()
    fun getLampStat() : Boolean
}