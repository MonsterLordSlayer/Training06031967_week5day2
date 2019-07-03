package com.example.week4day2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var person:Person
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    fun onClick(view : View){
        person= Person(etFirstname.text.toString(),etLastname.text.toString(),etAddress.text.toString(),etCity.text.toString(),etState.text.toString(),etZip.text.toString());

        tvFirstname.text=person.firstname
        tvLastname.text=person.lastname
        tvAddress.text=person.address
        tvCity.text=person.city
        tvState.text=person.state
        tvZip.text=person.zip

    }
}
