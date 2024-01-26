package com.furkancolak.calculater

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.furkancolak.calculater.databinding.ActivityMainBinding

private  lateinit var binding: ActivityMainBinding
var number1 = 0
var number2 = 0


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater) //XML ile Kodu birbirine bağlar
        val view = binding.root
        setContentView(view)


    }
    fun topla(view : View){
        val number1 = binding.numberOne.text.toString().toDoubleOrNull()
        val number2 = binding.numberTwo.text.toString().toDoubleOrNull()

        if(number1 != null && number2 !=null){
            val result = number1 + number2
            binding.result.text = "Sonuc = ${result}"
        }
        else{
            binding.result.text = "Yanlis giris yaptiniz"
        }
    }
    fun cikar(view :View){

        val number1 = binding.numberOne.text.toString().toDoubleOrNull()
        val number2 = binding.numberTwo.text.toString().toDoubleOrNull()
        if(number1 != null && number2 !=null){
            val result = number1 - number2
            binding.result.text = "Sonuc = ${result}"
        }
        else{
            binding.result.text = "Yanlis giris yaptiniz"
        }

    }
    fun carp(view : View){

        val number1 = binding.numberOne.text.toString().toDoubleOrNull()
        val number2 = binding.numberOne.text.toString().toDoubleOrNull()

        if(number1 != null && number2 !=null){
            val result = number1  * number2
            binding.result.text = "Sonuc = ${result}"
        }
        else{
            binding.result.text = "Yanlis giris yaptiniz"
        }

    }
    fun bol(view :View){

        val number1 = binding.numberOne.text.toString().toDoubleOrNull()
        val number2 = binding.numberOne.text.toString().toDoubleOrNull()

        if(number1 != null && number2 !=null){
            val result = number1 /  number2
            binding.result.text = "Sonuc = ${result}"
        }
        else{
            binding.result.text = "Yanlis giris yaptiniz"
        }
    }


}