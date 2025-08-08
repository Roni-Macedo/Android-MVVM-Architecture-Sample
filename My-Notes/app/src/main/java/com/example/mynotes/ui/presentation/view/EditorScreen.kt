package com.example.mynotes.ui.presentation.view

import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Save
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.example.mynotes.data.local.TarefaEntity
import com.example.mynotes.ui.presentation.viewmodel.TarefaViewModel
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun InputScreen(
    navController: NavHostController,
    tarefaId: Int,
    viewModel: TarefaViewModel = hiltViewModel()
) {
    val context = LocalContext.current
    var titulo by remember { mutableStateOf("") }
    var descricao by remember { mutableStateOf("") }
    var tarefaEditando by remember { mutableStateOf<TarefaEntity?>(null) }

    // Buscar tarefa se for edição
    LaunchedEffect(tarefaId) {
        if (tarefaId != -1) {
            val tarefa = viewModel.getTarefaById(tarefaId)
            tarefa?.let {
                titulo = it.title
                descricao = it.description
                tarefaEditando = it
            }
        }
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(if (tarefaId == -1) "Nova Nota" else "Editar Nota") },
                navigationIcon = {
                    IconButton(onClick = { navController.navigateUp() }) {
                        Icon(Icons.Default.ArrowBack, contentDescription = "Voltar")
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.background,
                    titleContentColor = MaterialTheme.colorScheme.secondary
                )
            )
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = {
                    if (titulo.isNotBlank() && descricao.isNotBlank()) {
                        val novaTarefa = TarefaEntity(
                            id = tarefaEditando?.id ?: 0,
                            title = titulo,
                            description = descricao,
                            date = SimpleDateFormat("dd/MM/yyyy HH:mm", Locale.getDefault()).format(Date())
                        )

                        if (tarefaId == -1) {
                            viewModel.addTarefa(novaTarefa)
                        } else {
                            viewModel.updateTarefa(novaTarefa)
                        }

                        navController.navigate("home") {
                            popUpTo("home") { inclusive = true }
                        }
                    } else {
                        Toast.makeText(context, "Preencha todos os campos!", Toast.LENGTH_SHORT).show()
                    }
                },
                containerColor = MaterialTheme.colorScheme.primary
            ) {
                Icon(Icons.Default.Save, contentDescription = "Salvar")
            }
        }
    ) { innerPadding ->
        Column(
            Modifier
                .padding(innerPadding)
                .padding(16.dp)
                .fillMaxSize()
        ) {
            OutlinedTextField(
                value = titulo,
                onValueChange = { titulo = it },
                label = { Text("Título") },
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(Modifier.height(16.dp))
            OutlinedTextField(
                value = descricao,
                onValueChange = { descricao = it },
                label = { Text("Descrição") },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
            )
        }
    }
}
