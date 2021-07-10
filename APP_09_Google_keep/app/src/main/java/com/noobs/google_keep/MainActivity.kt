package com.noobs.google_keep

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rv = findViewById<RecyclerView>(R.id.rvNotas)

        val lista = mutableListOf<Nota>(
            Nota(titulo = "Encontro DEV", descricao = "Encontro Grupo Noobs para fazer as atividades."),
            Nota(titulo = "Jogo", descricao = "Assistir Final da copa América - 21:00"),
            Nota(titulo = "Vacina", descricao = "segunda-feira, dia 11 de julho, tomar vacina coronavac"),
            Nota(titulo = "Github", descricao = "Enviar todas os APPs no GitHub até as 23:59")
        )

        rv.adapter = NotaAdapter(lista)

        rv.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
    }
}