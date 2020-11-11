package com.example.testkmmapp.androidApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.testkmmapp.shared.Greeting
import android.widget.TextView
import android.widget.Toast

fun greet(): String {
    return Greeting().greeting()
}

class MainActivity : AppCompatActivity() {
    var num1 = ""
    var num2 = ""


    var oper = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv: TextView = findViewById(R.id.txtOutput)
        tv.text = greet()


        // get reference to button
        val btnClear = findViewById<Button>(R.id.btnClear)
        // set on-click listener
        btnClear.setOnClickListener {
            oper = 0
            var txtFunc = findViewById<TextView>(R.id.txtFunc)
            val output = findViewById<TextView>(R.id.txtOutput)
            txtFunc.text = ""
            output.text = ""
        }

        // get reference to button
        val btnZero = findViewById<Button>(R.id.btnZero)
        // set on-click listener
        btnZero.setOnClickListener {
            extend("0")
        }

        // get reference to button
        val btnOne = findViewById<Button>(R.id.btnOne)
        // set on-click listener
        btnOne.setOnClickListener {
            extend("1")
        }

        // get reference to button
        val btnTwo = findViewById<Button>(R.id.btnTwo)
        // set on-click listener
        btnTwo.setOnClickListener {
            extend("2")
        }

        // get reference to button
        val btnThree = findViewById<Button>(R.id.btnThree)
        // set on-click listener
        btnThree.setOnClickListener {
            extend("3")
        }

        // get reference to button
        val btnFour = findViewById<Button>(R.id.btnFour)
        // set on-click listener
        btnFour.setOnClickListener {
            extend("4")
        }

        // get reference to button
        val btnFive = findViewById<Button>(R.id.btnFive)
        // set on-click listener
        btnFive.setOnClickListener {
            extend("5")
        }

        // get reference to button
        val btnSix = findViewById<Button>(R.id.btnSix)
        // set on-click listener
        btnSix.setOnClickListener {
            extend("6")
        }

        // get reference to button
        val btnSeven = findViewById<Button>(R.id.btnSeven)
        // set on-click listener
        btnSeven.setOnClickListener {
            extend("7")
        }

        // get reference to button
        val btnEight = findViewById<Button>(R.id.btnEight)
        // set on-click listener
        btnEight.setOnClickListener {
            extend("8")
        }

        // get reference to button
        val btnNine = findViewById<Button>(R.id.btnNine)
        // set on-click listener
        btnNine.setOnClickListener {
            extend("9")
        }

        // get reference to button
        val btnMinus = findViewById<Button>(R.id.btnMinus)
        // set on-click listener
        btnMinus.setOnClickListener {
            operation(2)
        }

        // get reference to button
        val btnAdd = findViewById<Button>(R.id.btnPlus)
        // set on-click listener
        btnAdd.setOnClickListener {
            operation(1)
        }

        // get reference to button
        val btnMult = findViewById<Button>(R.id.btnMult)
        // set on-click listener
        btnMult.setOnClickListener {
            operation(3)
        }

        // get reference to button
        val btnDivide = findViewById<Button>(R.id.btnDivide)
        // set on-click listener
        btnDivide.setOnClickListener {
            operation(4)
        }

        // get reference to button
        val btnEquals = findViewById<Button>(R.id.btnEquals)
        // set on-click listener
        btnEquals.setOnClickListener {
            calc()
        }
    }
    private fun extend(x: String) {
        var txtFunc = findViewById<TextView>(R.id.txtFunc)
        var txt = txtFunc.text.toString() + x
        if(oper > 0){
            num2 += x
        }
        else{
            num1 += x
        }
        txtFunc.text = txt
    }
    fun operation(x: Int){
        var txtFunc = findViewById<TextView>(R.id.txtFunc)
        oper = x
        var txt = ""
        if(oper == 1){
            txt = txtFunc.text.toString() + " + "
        }
        else if(oper == 2){
            txt = txtFunc.text.toString() + " - "
        }
        else if(oper == 3){
            txt = txtFunc.text.toString() + " X "
        }
        else if(oper == 4){
            txt = txtFunc.text.toString() + " ÷ "
        }
        txtFunc.text = txt

    }
    fun calc(){
        val output = findViewById<TextView>(R.id.txtOutput)
        var x: Double = 0.0
        if(oper === 1){
            x = num1.toDouble() + num2.toDouble()
        }
        else if(oper === 2){
            x = num1.toDouble() - num2.toDouble()
        }
        else if(oper === 3){
            x = num1.toDouble() * num2.toDouble()
        }
        else if(oper === 4) {
            x = num1.toDouble() / num2.toDouble()
        }


        output.text = x.toString()
        num1 = ""
        num2 = ""
        oper = 0
    }

}
