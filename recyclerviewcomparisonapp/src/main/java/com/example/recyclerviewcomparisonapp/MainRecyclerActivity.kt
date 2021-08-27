package com.example.recyclerviewcomparisonapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recyclerviewcomparisonapp.ui.main.MainRecyclerFragment

class MainRecyclerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_recycler_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainRecyclerFragment.newInstance())
                .commitNow()
        }
    }
}