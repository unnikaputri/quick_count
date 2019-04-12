package com.latihan.quickcount

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_edit_profil.*


class EditprofilActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_profil)

        button_kirim.setOnClickListener{
            Toast.makeText(this, "Data berhasil dikirim", Toast.LENGTH_LONG).show()

        }
        button_batal.setOnClickListener{
            startActivity(Intent(this, MainActivity2::class.java))
        }


    }
}