package com.khalidcoding.elicandprog.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.Button
import android.widget.ImageView
import com.khalidcoding.elicandprog.R
import com.khalidcoding.elicandprog.pojo.Lamp
import com.khalidcoding.elicandprog.pojo.Switch
import com.khalidcoding.elicandprog.pojo.Switch1
import com.khalidcoding.elicandprog.pojo.Switch2
import kotlinx.android.synthetic.main.activity_main.*

/**
 * Created by KHALID EL MRABTI&Khalid Coding on 02/06/20.
 * Lamp control with two switches an android application made using android studio and kotlin
 */

class MainActivity : AppCompatActivity(), View.OnClickListener {

    var lamp = Lamp()
    var switch1 = Switch1()
    var switch2 = Switch2()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        setContentView(R.layout.activity_main)
        switch1_btn.setOnClickListener(this)
        switch2_btn.setOnClickListener(this)
        init()


    }


    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.switch1_btn -> {
                smart(switch1, switch1_btn)
            }
            R.id.switch2_btn -> {
                smart(switch2, switch2_btn)
            }
        }
    }

    private fun smart(switch : Switch, btn: ImageView) {

        if (switch.getSwitchStat() == switch.up) {
            switch.setSwitchDown(btn)
        } else if (switch.getSwitchStat() == switch.down) {
            switch.setSwitchUp(btn)
        }

        if (lamp.getLampStat() == lamp.on) {
            lamp.turnOff(lamp_iv)
        } else if (lamp.getLampStat() == lamp.off) {
            lamp.turnOn(lamp_iv)
        }
        switch.setSwitchStat()
        lamp.setLampStat()
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




