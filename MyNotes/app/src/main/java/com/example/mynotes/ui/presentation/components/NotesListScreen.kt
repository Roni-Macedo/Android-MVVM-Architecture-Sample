package com.example.mynotes.ui.presentation.components

import androidx.compose.runtime.Composable

data class Note(
    val id: Int,
    val title: String,
    val description: String,
    val dateTime: String
)
val notes = listOf(
    Note(1, "Comprar leite", "Lembrete para comprar leite no mercado", "29/07/2025 - 10:00"),
    Note(2, "Reunião com equipe", "Alinhar metas do trimestre", "29/07/2025 - 14:30"),
    Note(3, "Estudar Jetpack Compose", "Revisar State, ViewModel e Navigation", "29/07/2025 - 16:00"),
    Note(4, "Ligar para o João", "Conversar sobre o projeto da faculdade porque ele é muito legal", "29/07/2025 - 18:00"),
    Note(5, "Levar carro na oficina", "Trocar óleo e revisão", "30/07/2025 - 09:00"),
    Note(6, "Consulta médica", "Doutor Ricardo - Clínica Saúde", "30/07/2025 - 11:30"),
    Note(7, "Escrever artigo técnico", "Tema: Boas práticas com Room + Hilt", "30/07/2025 - 15:00"),
    Note(8, "Praticar inglês", "Assistir vídeo aula + prática de conversação", "30/07/2025 - 17:00"),
    Note(9, "Planejar viagem", "Ver passagens e hospedagem", "31/07/2025 - 13:00"),
    Note(10, "Atualizar currículo", "Adicionar projetos recentes", "31/07/2025 - 20:00")
)
