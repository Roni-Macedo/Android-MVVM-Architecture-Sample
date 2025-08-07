package com.example.mynotes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.mynotes.ui.screens.homescreen.HomeScreen
import com.example.mynotes.ui.screens.inputscreen.InputScreen
import com.example.mynotes.ui.theme.MyNotesTheme
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContent {
            MyNotesTheme("1") {
                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = "home") {
                    composable("home") {
                        HomeScreen(navController)
                    }
                    composable(
                        route = "input/{tarefaId}",
                        arguments = listOf(navArgument("tarefaId") { defaultValue = -1 })
                    ) { backStackEntry ->
                        val tarefaId = backStackEntry.arguments?.getInt("tarefaId") ?: -1
                        InputScreen(navController, tarefaId)
                    }
                }
            }
        }
    }
}
