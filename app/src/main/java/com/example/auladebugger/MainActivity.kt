package com.example.auladebugger

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val listaUsuarios = listOf("Jamilton", "Ana", "Maria", "João")
        exibirListasItens(listaUsuarios)
    }

    private fun exibirListasItens(listasUsuarios: List<String>) {
        var exibirPrimeiroItem = true
        var contadorItens = 0

        for(usuario in listasUsuarios){
            if (exibirPrimeiroItem){
                println("Primeiro usuário: ")
                exibirPrimeiroItem = false
            }
            println(usuario)
            contadorItens++
        }
    }
}