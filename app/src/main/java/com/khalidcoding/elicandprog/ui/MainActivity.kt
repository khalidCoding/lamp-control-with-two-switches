package com.khalidcoding.elicandprog.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import com.khalidcoding.elicandprog.R
import com.khalidcoding.elicandprog.pojo.Lamp
import com.khalidcoding.elicandprog.pojo.Switch1
import com.khalidcoding.elicandprog.pojo.Switch2
import kotlinx.android.synthetic.main.activity_main.*

/**
 * Created by KHALID EL MRABTI&Khalid Coding on 02/06/20.
 * Lamp control with two switches an android application made using android studio and kotlin
 */

class MainActivity : AppCompatActivity() {

    var switch1 = Switch1()
    var switch2 = Switch2()
    var lamp = Lamp()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        setContentView(R.layout.activity_main)

        init()

        switch1_btn.setOnClickListener {

            if (switch1.getSwitchStat() == switch1.up) {
                switch1.setSwitchDown(switch1_btn)
            } else if (switch1.getSwitchStat() == switch1.down) {
                switch1.setSwitchUp(switch1_btn)
            }

            if (lamp.getLampStat() == lamp.on) {
                lamp.turnOff(lamp_iv)
            } else if (lamp.getLampStat() == lamp.off) {
                lamp.turnOn(lamp_iv)
            }
            switch1.setSwitchStat()
            lamp.setLampStat()

        }
        switch2_btn.setOnClickListener {

            if (switch2.getSwitchStat() == switch2.up) {
                switch2.setSwitchDown(switch2_btn)
            } else if (switch2.getSwitchStat() == switch2.down) {
                switch2.setSwitchUp(switch2_btn)
            }

            if (lamp.getLampStat() == lamp.on) {
                lamp.turnOff(lamp_iv)
            } else if (lamp.getLampStat() == lamp.off) {
                lamp.turnOn(lamp_iv)
            }
            switch2.setSwitchStat()
            lamp.setLampStat()

        }


    }

    fun init() {
        switch1.down = false
        switch1.up = true
        switch2.down = false
        switch2.up = true
        lamp.on = true
        lamp.off = false
    }

}


