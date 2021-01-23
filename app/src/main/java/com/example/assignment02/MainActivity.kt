package com.example.assignment02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text01 = Toast.makeText(applicationContext,"Username and password must not be the same.",Toast.LENGTH_LONG)
        val text02 = Toast.makeText(applicationContext,"Password do not match.",Toast.LENGTH_LONG)
        val text03 = Toast.makeText(applicationContext,"Fill out all fields.",Toast.LENGTH_LONG)
        val text04 = Toast.makeText(applicationContext,"OK.",Toast.LENGTH_LONG)
        val text05 = Toast.makeText(applicationContext,"Complete.",Toast.LENGTH_LONG)

        OK.setOnClickListener(){
            if (this.tvUsername.text.toString() == "" || this.tvPassword.text.toString() == "" || this.tvConfirm.text.toString() == ""){
                text03.show()
        }
            else{
                if (this.tvUsername.text.toString() == this.tvPassword.text.toString() || this.tvUsername.text.toString() == this.tvConfirm.text.toString() ||
            this.tvUsername.text.toString() == this.tvPassword.text.toString() && this.tvUsername.text.toString() == this.tvConfirm.text.toString()){
                    text01.show()
                }
                else if (this.tvPassword.text.toString() == this.tvConfirm.text.toString()){
                    text04.show()
                }
                else{
                    text02.show()
                }
            }
        }

        Clear.setOnClickListener(){
            tvUsername.setText(null)
            tvPassword.setText(null)
            tvConfirm.setText(null)
            text05.show()
        }

    }
}