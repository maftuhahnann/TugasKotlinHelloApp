package psti.unram.helloapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edHello : EditText = findViewById(R.id.edHello)
        val btnHello : Button = findViewById(R.id.btnHello)
        val tvHello : TextView = findViewById(R.id.tvHello)

        btnHello.setOnClickListener {
            val str: String = edHello.text.toString()
            tvHello.setText("Hello king $str")
        }
    }
}