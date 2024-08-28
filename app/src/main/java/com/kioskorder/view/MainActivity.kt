package com.kioskorder.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.kioskorder.ui.theme.KioskOrderTheme
import com.kioskorder.view.loadingscreen.Loadingscreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            KioskOrderTheme {
                Loadingscreen()
            }
        }
    }
}
