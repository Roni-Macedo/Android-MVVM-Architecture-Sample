package com.example.mynotes.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tarefa_db")
data class TarefaEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val title: String,
    val description: String,
    val date: String,
)
