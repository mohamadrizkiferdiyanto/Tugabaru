package com.example.tugasintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main2.*
class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var intent = intent
        val nim = intent.getStringExtra("Nim")
        val nama = intent.getStringExtra("Nama")
        val nilai = intent.getStringExtra("Nilai")
        var keterangan = intent.getStringExtra("Keterangan")

        if (nilai >= 80.toString()){
            keterangan = "A"
        }else if(nilai >= 60.toString()||nilai <80.toString()){
            keterangan ="B"
        }else if (nilai >= 40.toString()|| nilai < 60.toString()){
            keterangan ="C"
        }else if(nilai >= 20.toString()||nilai < 40.toString()){
            keterangan = "D"
        }else{
            keterangan ="E"
        }
        //tx_Nim.text = ("\n Nim :" +(nim))
        // tx_nama.text = ("\n Nama :" + (nama))
        //tx_nilai.text = ("\n Nilai :"+(nilai))
        val resultTv = findViewById<TextView>(R.id.resultTv)
        Tampilan.text ="Nim : "+nim+"\nNama :"+nama+"\nNilai :"+nilai+"\nKeterangan :"+keterangan
        Toast.makeText(applicationContext, nim.toString()+nama+nilai, Toast.LENGTH_LONG).show()

    }
}
