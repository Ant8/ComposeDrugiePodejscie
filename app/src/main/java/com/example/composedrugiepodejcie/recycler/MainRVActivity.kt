package com.example.composedrugiepodejcie.recycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.composedrugiepodejcie.R
import com.example.composedrugiepodejcie.recycler.ui.main.MainRVFragment

class MainRVActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_r_v_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainRVFragment.newInstance())
                .commitNow()
        }
    }
}