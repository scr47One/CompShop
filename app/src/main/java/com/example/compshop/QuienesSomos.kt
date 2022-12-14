package com.example.compshop

import android.content.Intent
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.compshop.databinding.ActivityQuienesSomosBinding

class QuienesSomos : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityQuienesSomosBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityQuienesSomosBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.regresar.setOnClickListener{startActivity(Intent(this, MainActivity::class.java))}

    }


}