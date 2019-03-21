package com.example.aluno.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnLogin :  Button = findViewById<Button>(R.id.button)


        btnLogin.setOnClickListener(View.OnClickListener {
            val textViewLogin: TextView = findViewById<TextView>(R.id.txtEmail) as TextView
            val textViewPassword: TextView = findViewById<TextView>(R.id.txtPassword) as TextView


            val LogininResult: Boolean = SimulaBD.Login(
                    textViewLogin.text.toString(),
                    textViewPassword.text.toString())

            if (LogininResult == true) {
                toast("login realizado com sucesso")
            } else {
                toast("Usuario ou senha incorreta")
            }
        })
    }
}
