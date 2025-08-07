package com.example.mynotes.data.repository

import com.example.mynotes.data.local.TarefaEntity
import kotlinx.coroutines.flow.Flow

interface TarefaRepository {
    fun getAll(): Flow<List<TarefaEntity>>
    suspend fun insert(tarefa: TarefaEntity)
    suspend fun update(tarefa: TarefaEntity)
    suspend fun deleteById(id: Int)

     suspend fun getById(id: Int): TarefaEntity?

}
