package com.example.enitppractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ArticleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_article)

        // Récuperer l'article que nous avons envoyé depuis l'activité précèdente
        val article = intent.getParcelableExtra<Article>("article")

        // Si si l'article n'est pas null
        if (article != null){
            // Afficher le titre
            findViewById<TextView>(R.id.at_title).text = article.title

            // Afficher la description/contenu
            findViewById<TextView>(R.id.at_content).text = article.content
        }
    }
}