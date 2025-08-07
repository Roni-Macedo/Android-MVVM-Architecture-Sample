package com.example.mynotes.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.mynotes.data.local.TarefaEntity

@Database(entities = [TarefaEntity::class], version = 2)
abstract class TarefaDatabase : RoomDatabase() {
    abstract fun tarefaDao(): TarefaDao

}
