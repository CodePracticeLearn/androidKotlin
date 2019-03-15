package com.example.demo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.facebook.stetho.Stetho
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Stetho.initializeWithDefaults(this);

        save.setOnClickListener {
            val dbHandler = FeedReaderDbHelper(this, null)
            val user = DbConst(expenseName.text.toString(),Amount.text.toString())
            dbHandler.addData(user)
            Toast.makeText(this, expenseName.text.toString() + "Added to database", Toast.LENGTH_LONG).show()
        }

    }
}
