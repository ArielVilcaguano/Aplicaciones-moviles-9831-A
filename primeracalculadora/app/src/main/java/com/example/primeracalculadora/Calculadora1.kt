package com.example.primeracalculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Calculadora1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       setContentView(R.layout.activity_calculadora1)

        val n1= findViewById<EditText>(R.id.txt_1)
        val n2= findViewById<EditText>(R.id.txt_2)
        val r= findViewById<TextView>(R.id.txt_res)
        val btn_sumar= findViewById<Button>(R.id.btn_sumar)
        val btn_resta= findViewById<Button>(R.id.btn_restar)
        val btn_multiplicacion= findViewById<Button>(R.id.btnmultiplicar)
        val btn_division= findViewById<Button>(R.id.btndividir)

        btn_sumar.setOnClickListener {
            r.setText(
                "La suma es:"+(n1.text.toString().toInt()+n2.text.toString().toInt())
            )
       }

        btn_resta.setOnClickListener {
            r.setText(
                "La resta es:"+(n1.text.toString().toInt()-n2.text.toString().toInt())
            )
        }
        btn_multiplicacion.setOnClickListener {
            r.setText(
                "La multiplicacion es:"+(n1.text.toString().toInt()*n2.text.toString().toInt())
            )
        }
        btn_division.setOnClickListener {
            r.setText(
                "La division es:"+(n1.text.toString().toInt()/n2.text.toString().toInt())
            )
        }
        }

    }
