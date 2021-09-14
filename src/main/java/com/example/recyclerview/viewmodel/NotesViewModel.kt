package com.example.recyclerview.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.recyclerview.models.Note
import com.example.recyclerview.repository.NotesRepository
import kotlinx.coroutines.launch

class NotesViewModel: ViewModel() {
    var notesRepository= NotesRepository()

    fun saveNote(note: Note){
     viewModelScope.launch {
    notesRepository.saveNote(note)

}
    }
}