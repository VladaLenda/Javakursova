package com.university.vlada.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.university.vlada.models.Note;
import com.university.vlada.repositories.NoteRepository;

@Service
public class NoteService {
    @Autowired
    private NoteRepository noteRepository;

    public List<Note> getAllNotes() {
        return noteRepository.findAll();
    }

    public void save(Note note) {
        noteRepository.save(note);
    }

    public Note getById(Long id) {
        return noteRepository.findById(id).orElse(null);
    }

    public void delete(Long id) {
        noteRepository.deleteById(id);
    }
}
