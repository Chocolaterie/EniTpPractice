package com.example.enitppractice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Liste de données par défaut
        var articles = listOf<Article>(
            Article(1, "Stagiaire fou", "Il fait des dessins pendant le cours"),
            Article(2, "Formateur incompétent", "Il parle trop vite et tout le temps, on comprend rien"),
            Article(3, "Formateur un peu gentil", "Il a ramené des pains aux chocolatines"))

        // Instancie un adapater
        val arrayAdapter = ArrayAdapter<Article>(this, android.R.layout.simple_list_item_1, articles)

        // Associe adapter avec le notre
        findViewById<ListView>(R.id.listview_1).adapter = arrayAdapter

        // Ecouter l'evenement onclick sur les elements de la liste
        findViewById<ListView>(R.id.listview_1).setOnItemClickListener { parent, view, position, id ->

            // Déclare l'intent
            val intent = Intent(this, ArticleActivity::class.java)

            // On récupère l'article de l'element
            val article = arrayAdapter.getItem(position) as Article

            // On ajoute l'article dans l'intent
            intent.putExtra("article", article)

            // Ouvre une nouvelle activité grace à l'intent
            startActivity(intent)
        }

    }
}