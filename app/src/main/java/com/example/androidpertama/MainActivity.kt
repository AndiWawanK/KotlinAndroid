package com.example.androidpertama

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.androidpertama.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

//        val button : Button = findViewById(R.id.btn1)

        binding.btn1.setOnClickListener {
            // lakukan sesuatu
//            Toast.makeText(this@MainActivity, "Tombol berhasil di klik!", Toast.LENGTH_SHORT)
////                .show()
////            btn1.setText("Pressed!")
            val name = binding.fullName.text.toString()
            if(name == null || name.trim() == "") {
                Toast.makeText(this@MainActivity, "Input tidak boleh kosong!", Toast.LENGTH_SHORT)
                    .show()
            }else {
                binding.view.setText(name)

                // change image
                val imgRes = resources.getIdentifier(name, "drawable", packageName)
                binding.imageSearch.setImageResource(imgRes)

            }
        }

    }
}