package com.demo.addtwonumbers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.demo.addtwonumbers.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var mBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        mBinding.btnAdd.setOnClickListener {
            val firstNo = mBinding.txtNumber1.text.toString().trim()
            val secondNo = mBinding.txtNumber2.text.toString().trim()
            when {
                firstNo == "" -> {
                    Toast.makeText(this, "Please enter first number", Toast.LENGTH_SHORT).show()
                    return@setOnClickListener
                }
                secondNo == "" -> {
                    Toast.makeText(this, "Please enter second number", Toast.LENGTH_SHORT).show()
                }
                else -> {
                    val result = firstNo.toInt() + secondNo.toInt()
                    mBinding.txtResult.text = result.toString()
                }
            }
        }
    }
}