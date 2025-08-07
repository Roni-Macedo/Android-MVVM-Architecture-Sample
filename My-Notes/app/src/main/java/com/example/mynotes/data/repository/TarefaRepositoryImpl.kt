package com.example.mynotes.data.repository

import com.example.mynotes.data.local.TarefaDao
import com.example.mynotes.data.local.TarefaEntity
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class TarefaRepositoryImpl @Inject constructor(
    private val dao: TarefaDao
) : TarefaRepository {

    override fun getAll(): Flow<List<TarefaEntity>> = dao.getAll()

    override suspend fun insert(tarefa: TarefaEntity) = dao.insert(tarefa)

    override suspend fun update(tarefa: TarefaEntity) = dao.update(tarefa)

    override suspend fun deleteById(id: Int) = dao.deleteById(id)

    override suspend fun getById(id: Int): TarefaEntity? = dao.getById(id)

}
