package ru.samsung.itschool.myapplication

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.google.gson.Gson

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var user:User = User("Иван", "Иванов", 7)
        Log.d("Gson test", Gson().toJson(user))
        // Строка JSON: {"firstname":"Петр","lastname":"Петров","school":1}"
        val jsonText = "{\"firstname\":\"Петр\",\"lastname\":\"Петров\",\"school\":1}"
        user = Gson().fromJson(jsonText,User::class.java)
        Log.i("Gson test",user.firstname + " " +
                user.lastname + " " + user.school)
    }
}