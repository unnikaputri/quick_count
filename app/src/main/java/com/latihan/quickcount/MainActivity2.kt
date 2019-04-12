package com.latihan.quickcount

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.main2, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.input_suara -> {
                startActivity(Intent(this, InputsuaraActivity::class.java))
                true
            }
            R.id.edit_profil -> {
                startActivity(Intent(this, EditprofilActivity::class.java))
                true
            }
            R.id.logout -> {
                startActivity(Intent(this, MainActivity::class.java))
                true
            }

            else -> super.onOptionsItemSelected(item)
        }
    }
}