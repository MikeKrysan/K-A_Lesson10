package com.appbymikekrysan.ka_lesson10

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.appbymikekrysan.ka_lesson10.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bindingClass : ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        bindingClass.btResult.setOnClickListener {
            val resultValue = bindingClass.edValue.text.toString().toInt()
            when(resultValue) {
                in 0..1000 ->  {
                    bindingClass.tvResult.visibility = View.VISIBLE
                    bindingClass.tvResult.text = "Вы начинающий блогер"
                }
                in 1000..100000 -> {
                    bindingClass.tvResult.visibility = View.VISIBLE
                    bindingClass.tvResult.text = "Вы средний блогер"
                }
                    else -> {
                        bindingClass.tvResult.visibility = View.VISIBLE
                        bindingClass.tvResult.text = "Вы суперзвезда!"
                    }
            }

        }


    }
}