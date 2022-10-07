package com.example.labels

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    lateinit var name:EditText
    lateinit var ok:Button
    lateinit var result:TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        name=findViewById(R.id.name)
        ok=findViewById(R.id.ok)
        result=findViewById(R.id.result)

        ok.setOnClickListener{
            var Main_Name:String=name.text.toString()
            result.setText(Main_Name)
        }




    }
}