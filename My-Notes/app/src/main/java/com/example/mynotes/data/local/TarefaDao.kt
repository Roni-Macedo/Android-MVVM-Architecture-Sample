package com.example.mynotes.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.mynotes.data.local.TarefaEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface TarefaDao {
    @Insert
    suspend fun insert(tarefa: TarefaEntity)

    @Query("SELECT * FROM tarefa_db")
    fun getAll(): Flow<List<TarefaEntity>>

    @Update
    suspend fun update(tarefa: TarefaEntity)

    @Query("DELETE FROM tarefa_db WHERE id = :id")
    suspend fun deleteById(id: Int)

    @Query("SELECT * FROM tarefa_db WHERE id = :id")
    suspend fun getById(id: Int): TarefaEntity?

}

