package com.appbymikekrysan.ka_lesson10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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
            val resultValue = bindingClass.edValue.text.toString()
            when(resultValue) {
                Constance.ENGINEER->  {
                    bindingClass.tvResult.visibility = View.VISIBLE
                    val tempText = "Получите ваши ${Constance.ENGINEER_SALARY}"
                    (bindingClass.tvResult.text) = if(bindingClass.edPassword.text.toString() == Constance.ENGINEER_PASSWORD){
                        tempText
                    } else {
                        "Неверный пароль"
                    }
                }
                Constance.CLEANER -> {
                    bindingClass.tvResult.visibility = View.VISIBLE
                    val tempText = "Получите ваши ${Constance.CLEANER_SALARY}"
                    (bindingClass.tvResult.text) = if(bindingClass.edPassword.text.toString() == Constance.CLEANER_PASSWORD){
                        tempText
                    } else {
                        "Неверный пароль"
                    }
                }

                Constance.DIRECTOR -> {
                    bindingClass.tvResult.visibility = View.VISIBLE
                    val tempText = "Получите ваши ${Constance.DIRECTOR_SALARY}"
                    (bindingClass.tvResult.text) = if(bindingClass.edPassword.text.toString() == Constance.DIRECTOR_PASSWORD){
                        tempText
                    } else {
                        "Неверный пароль"
                    }
                }

                    else -> {
                        bindingClass.tvResult.visibility = View.VISIBLE
                        bindingClass.tvResult.text = "Нет такого работника"
                    }
            }

        }

    }
}