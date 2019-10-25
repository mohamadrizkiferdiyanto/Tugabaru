package com.example.tugasintent
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nim = findViewById<EditText>(R.id.NIM)
        val nama = findViewById<EditText>(R.id.NAMA)
        val nilai = findViewById<EditText>(R.id.Nilai)

        Simpandata.setOnClickListener(){
            if((nim.text.isEmpty())||(nama.text.isEmpty())||(nilai.text.isEmpty())){
                Toast.makeText(applicationContext,"Harus Diisi",Toast.LENGTH_SHORT).show()

            }else if((nim.text.isNotEmpty())||(nama.text.isNotEmpty())||(nilai.text.isNotEmpty())){
                Toast.makeText(applicationContext,"proses",Toast.LENGTH_LONG).show()

                val nim = nim.text.toString()
                val nama = nama.text.toString()
                val nilai = nilai.text.toString()
                var ket: String?=""

                val intent = Intent(this,Main2Activity::class.java)
                intent.putExtra("Nim",nim)
                intent.putExtra("Nama",nama)
                intent.putExtra("Nilai", nilai)
                intent.putExtra("Keterangan", ket)

                startActivity(intent)
            }
        }
    }
}