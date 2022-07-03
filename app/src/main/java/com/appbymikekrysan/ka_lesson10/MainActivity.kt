package com.appbymikekrysan.ka_lesson10

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.appbymikekrysan.ka_lesson10.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bindingClass : ActivityMainBinding
    val maxPerson = 90
    val currentPerson = 93
    val text = "опасность"
    val text2 = "споко"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

//        bindingClass.b1.setOnClickListener{
//            bindingClass.tvResult.text = if(maxPerson > currentPerson)
//                "Все в порядке"
//            else
//                "Превышено максимальное количество посетителей "
//        }

//        bindingClass.b1.setOnClickListener{
//            if(maxPerson > currentPerson) {
//                bindingClass.tvResult.text = "Все в порядке"
//                bindingClass.tvResult.setBackgroundColor(Color.GREEN)
//            }
//                else {
//                bindingClass.tvResult.text = "Превышено максимальное количество посетителей "
//                bindingClass.tvResult.setBackgroundColor(Color.RED)
//            }
//        }

//        bindingClass.b1.setOnClickListener {
//            when(currentPerson) {
//                in 0..maxPerson -> bindingClass.tvResult.text = "Все в порядке"
//                else -> bindingClass.tvResult.text = "Предел превышен"
//
//            }
//        }

//        bindingClass.b1.setOnClickListener {
//            bindingClass.tvResult.text = when(currentPerson) {
//                in 0..maxPerson -> "Все в порядке"
//                else -> "Предел превышен"
//
//            }
//        }

//        bindingClass.b1.setOnClickListener {
//            bindingClass.tvResult.text = when(currentPerson) {
//                !in 0..maxPerson -> "Предел превышен"
//                else -> "Все в порядке"
//            }
//        }

//        bindingClass.b1.setOnClickListener {
//            bindingClass.tvResult.text = when(currentPerson) {
//                90,91,92 -> "Предел превышен"
//                else -> "Все в порядке"
//            }
//        }

//        bindingClass.b1.setOnClickListener {
//            bindingClass.tvResult.text = when(maxPerson > currentPerson) {
//                false -> "Предел превышен"
//                true -> "Все в порядке"
//            }
//        }

//        bindingClass.b1.setOnClickListener {
//            bindingClass.tvResult.text = when(text) {
//                text2 -> "Предел превышен"
//                text -> "Все в порядке"
//                    else -> "Не понятно"
//            }
//        }

        bindingClass.b1.setOnClickListener {
            when(text) {
                text2 -> bindingClass.tvResult.text = "Предел превышен"
                text -> bindingClass.tvResult.text = "Все в порядке"
            }
        }

        bindingClass.b2.setOnClickListener{

        }

        bindingClass.b3.setOnClickListener{

        }
    }
}