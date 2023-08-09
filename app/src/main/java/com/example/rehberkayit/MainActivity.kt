package com.example.rehberkayit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
//import com.example.myapp.databinding.ActivityMainBinding
import com.example.rehberkayit.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        R.string.app_name
        R.color.black

        val editTextKullaniciAdi = binding.editTextAd



        binding.buttonKayit.setOnClickListener{
            if (editTextKullaniciAdi.text.isEmpty()){

                Snackbar.make(it,"Ad ve Telefon Numarası boş bırakılamaz!", Snackbar.LENGTH_SHORT).show()
            }else{

                val loginIntent = Intent(this@MainActivity, LoginActivity::class.java)
                startActivity(loginIntent)
            }

        }
    }
}