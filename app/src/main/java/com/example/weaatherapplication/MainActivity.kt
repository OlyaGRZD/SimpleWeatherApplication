package com.example.weaatherapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.weaatherapplication.fragments.MainFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager // Подключаем на мэйн активити Мейн Фрагмент
            .beginTransaction().replace(R.id.placeHolder, MainFragment.newInstance())
            .commit()
    }
}