package com.example.mynotes.di

import android.content.Context
import androidx.room.Room
import com.example.mynotes.data.local.TarefaDao
import com.example.mynotes.data.local.TarefaDatabase
import com.example.mynotes.data.repository.TarefaRepository
import com.example.mynotes.data.repository.TarefaRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext context: Context): TarefaDatabase {
        return Room.databaseBuilder(
            context,
            TarefaDatabase::class.java,
            "tarefa_db"
        ).build()
    }

    @Provides
    fun provideTarefaDao(db: TarefaDatabase): TarefaDao = db.tarefaDao()

    @Provides
    fun provideRepository(dao: TarefaDao): TarefaRepository =
        TarefaRepositoryImpl(dao)
}