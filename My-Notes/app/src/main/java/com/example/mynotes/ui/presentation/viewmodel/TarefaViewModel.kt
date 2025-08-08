package com.example.mynotes.ui.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mynotes.data.local.TarefaEntity
import com.example.mynotes.data.repository.TarefaRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import jakarta.inject.Inject
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

@HiltViewModel
class TarefaViewModel @Inject constructor(
    private val repository: TarefaRepository
) : ViewModel() {

    val tarefas = repository.getAll().stateIn(
        scope = viewModelScope,
        started = SharingStarted.Companion.WhileSubscribed(5000),
        initialValue = emptyList()
    )

    fun addTarefa(tarefa: TarefaEntity) {
        viewModelScope.launch {
            repository.insert(tarefa)
        }
    }

    fun updateTarefa(tarefa: TarefaEntity) {
        viewModelScope.launch {
            repository.update(tarefa)
        }
    }

    fun deleteTarefa(id: Int) {
        viewModelScope.launch {
            repository.deleteById(id)
        }
    }

    suspend fun getTarefaById(id: Int): TarefaEntity? {
        return repository.getById(id)
    }

}