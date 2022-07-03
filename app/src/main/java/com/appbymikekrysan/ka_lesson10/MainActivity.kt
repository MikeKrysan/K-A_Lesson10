package com.appbymikekrysan.ka_lesson10

import android.os.Build.ID
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.appbymikekrysan.ka_lesson10.constance.Constance
import com.appbymikekrysan.ka_lesson10.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bindingClass : ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        bindingClass.btResult.setOnClickListener {
//            Log.d("MyLog", "ID dulia = ${R.drawable.dulia}")
            val resultValue = bindingClass.edValue.text.toString()
            when(resultValue) {
                Constance.ENGINEER->  {
                    bindingClass.tvResult.visibility = View.VISIBLE
                    val tempText = "Получите ваши ${Constance.ENGINEER_SALARY}"
                     if(bindingClass.edPassword.text.toString() == Constance.ENGINEER_PASSWORD){
                         bindingClass.tvResult.text = tempText
                        bindingClass.imPhoto.setImageResource(R.drawable.andrey)
                    } else {
                         bindingClass.tvResult.text = "Неверный пароль"
//                         bindingClass.imPhoto.setImageResource("2131165286".toInt())
                         bindingClass.imPhoto.setImageResource(R.drawable.dulia)
//                         val idDulia = 2131165286
//                         bindingClass.imPhoto.setImageResource(idDulia)
                    }
                }
                Constance.CLEANER -> {
                    bindingClass.tvResult.visibility = View.VISIBLE
                    val tempText = "Получите ваши ${Constance.CLEANER_SALARY}"
                    if(bindingClass.edPassword.text.toString() == Constance.CLEANER_PASSWORD){
                        bindingClass.tvResult.text = tempText
                        bindingClass.imPhoto.setImageResource(R.drawable.sergey)
                    } else {
                        (bindingClass.tvResult.text) = "Неверный пароль"
                        bindingClass.imPhoto.setImageResource(R.drawable.dulia)
                    }
                }

                Constance.DIRECTOR -> {
                    bindingClass.tvResult.visibility = View.VISIBLE
                    val tempText = "Получите ваши ${Constance.DIRECTOR_SALARY}"
                    if(bindingClass.edPassword.text.toString() == Constance.DIRECTOR_PASSWORD){
                        bindingClass.tvResult.text = tempText
                        bindingClass.imPhoto.setImageResource(R.drawable.egor)
                    } else {
                        bindingClass.tvResult.text = "Неверный пароль"
                        bindingClass.imPhoto.setImageResource(R.drawable.dulia)
                    }
                }

                    else -> {
                        bindingClass.tvResult.visibility = View.VISIBLE
                        bindingClass.tvResult.text = "Нет такого работника"
                        bindingClass.imPhoto.setImageResource(R.drawable.dulia)

                    }
            }

        }

    }
}