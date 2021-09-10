package com.example.kotlinprac4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.kotlinprac4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
   lateinit var myName : MyName
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        myName = MyName("Aman Ahuja","Young Aman")
        binding.myName = myName

    }

    fun doneClicked(view: View) {



        binding.apply {

            myName?.nickname = question.text.toString()
            question.visibility = View.GONE
            invalidateAll()
            textView2.visibility = View.VISIBLE
        }


        view.visibility = View.GONE

    }
}