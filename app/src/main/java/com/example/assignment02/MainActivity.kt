package com.example.assignment02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text01 = Toast.makeText(applicationContext,"Please don't enter same username and password.",Toast.LENGTH_LONG)
        val text02 = Toast.makeText(applicationContext,"Password in both fields is different.",Toast.LENGTH_LONG)
        val text03 = Toast.makeText(applicationContext,"Please fill the empty fields.",Toast.LENGTH_LONG)
        val text04 = Toast.makeText(applicationContext,"Register successful.",Toast.LENGTH_LONG)

        OK.setOnClickListener(){
            if (this.Username01.text.toString() == "" || this.Password01.text.toString() == "" || this.Confirm01.text.toString() == ""){
                text03.show()
        }
            else{
                if (this.Username01.text.toString() == this.Password01.text.toString() || this.Username01.text.toString() == this.Confirm01.text.toString() ||
            this.Username01.text.toString() == this.Password01.text.toString() && this.Username01.text.toString() == this.Confirm01.text.toString()){
                    text01.show()
                }
                else if (this.Password01.text.toString() == this.Confirm01.text.toString()){
                    text04.show()
                }
                else{
                    text02.show()
                }
            }
        }

        Clear.setOnClickListener(){
            Username01.setText(null)
            Password01.setText(null)
            Confirm01.setText(null)
        }

    }
}