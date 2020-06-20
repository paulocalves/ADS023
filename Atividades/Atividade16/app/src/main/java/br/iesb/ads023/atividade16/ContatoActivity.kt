package br.iesb.ads023.atividade16

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ContatoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.title = "Novo"
        setContentView(R.layout.activity_contato)
    }
}