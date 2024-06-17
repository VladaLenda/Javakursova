package com.university.vlada.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.university.vlada.models.Tag;
import com.university.vlada.repositories.TagRepository;

@Service
public class TagService {
    @Autowired
    private TagRepository tagRepository;

    public List<Tag> getAllTags() {
        return tagRepository.findAll();
    }

    public void save(Tag tag) {
        tagRepository.save(tag);
    }

    public Tag getById(Long id) {
        return tagRepository.findById(id).orElse(null);
    }

    public void delete(Long id) {
        tagRepository.deleteById(id);
    }
}
