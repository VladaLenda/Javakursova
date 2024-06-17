package com.university.vlada.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.university.vlada.models.Note;
import com.university.vlada.services.NoteService;

@Controller
@RequestMapping("/notes")
public class NoteController {
    @Autowired
    private NoteService noteService;

    @GetMapping
    public String getAllNotes(Model model) {
        List<Note> notes = noteService.getAllNotes();
        model.addAttribute("notes", notes);
        return "notes";
    }

    @GetMapping("/create")
    public String createNoteForm(Model model) {
        model.addAttribute("note", new Note());
        return "create_note";
    }

    @PostMapping("/create")
    public String createNoteSubmit(@ModelAttribute Note note) {
        noteService.save(note);
        return "redirect:/notes";
    }

    @GetMapping("/edit/{id}")
    public String editNoteForm(@PathVariable Long id, Model model) {
        Note note = noteService.getById(id);
        model.addAttribute("note", note);
        return "edit_note";
    }

    @PostMapping("/edit/{id}")
    public String editNoteSubmit(@PathVariable Long id, @ModelAttribute Note note) {
        note.setId(id);
        noteService.save(note);
        return "redirect:/notes";
    }

    @GetMapping("/delete/{id}")
    public String deleteNote(@PathVariable Long id) {
        noteService.delete(id);
        return "redirect:/notes";
    }
}
