package com.latihan.quickcount

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // get post data
        val postServices = DataRepository.create()
        postServices.getPosts().enqueue(object : Callback<List<PostModel>> {

            override fun onResponse(call: Call<List<PostModel>>, response: Response<List<PostModel>>) {
                if (response.isSuccessful) {
                    val data = response.body()
                    Log.d("tag", "responsennya ${data?.size}")

                    data?.map {
                        Log.d("tag", "datanya ${it.body}")
                    }
                }
            }

            override fun onFailure(call: Call<List<PostModel>>, error: Throwable) {
                Log.e("tag", "errornya ${error.message}")
            }
        })

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {

            R.id.menulogin -> {
                startActivity(Intent(this, LoginActivity::class.java))
                true
            }
            R.id.help -> {
                startActivity(Intent(this, HelpActivity::class.java))
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }



