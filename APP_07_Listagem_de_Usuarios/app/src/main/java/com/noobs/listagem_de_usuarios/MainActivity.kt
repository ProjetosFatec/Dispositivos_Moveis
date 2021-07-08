package com.noobs.listagem_de_usuarios

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rv = findViewById<RecyclerView>(R.id.rvUsuarios)

        val lista = mutableListOf<Usuario>(
            Usuario(nome="Joseffe", email="joseffe@gmail.com", stack= Stack.BACKEND, senioridade= Senioridade.SENIOR, foto=resources.getDrawable(R.drawable.ic_launcher_background)),
            Usuario(nome="Macgyver", email="mac@gmail.com", stack= Stack.FULLSTACK, senioridade= Senioridade.JUNIOR, foto=resources.getDrawable(R.drawable.robo)),
            Usuario(nome="Joana", email="joana@gmail.com", stack= Stack.FRONTEND, senioridade= Senioridade.PLENO)
        )

        rv.adapter = UsuarioAdapter(lista)

        // Exibe os itens em uma coluna única no padrão vertical
        rv.layoutManager = LinearLayoutManager(this)

        // Exibe os itens em uma coluna única no padrão horizontal
        // rv.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        // Exibe os itens em uma tabela com x colunas
        // rv.layoutManager = GridLayoutManager(this, 2)

        // Exibe os itens em uma tabela porém as células são ajustadas automaticamente de acordo com o conteúdo (Google Keep, Pintrest)
        // rv.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
    }
}