package com.university.vlada.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.university.vlada.models.Note;

public interface NoteRepository extends JpaRepository<Note, Long> {
}
