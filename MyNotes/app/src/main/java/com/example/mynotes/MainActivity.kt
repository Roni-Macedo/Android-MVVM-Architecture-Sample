package com.example.mynotes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.mynotes.ui.presentation.view.HomeScreen
import com.example.mynotes.ui.theme.MyNotesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyNotesTheme(darkTheme = false) {
                HomeScreen()
            }
        }
    }
}
