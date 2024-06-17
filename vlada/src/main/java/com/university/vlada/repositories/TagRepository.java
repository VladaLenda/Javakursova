package com.university.vlada.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.university.vlada.models.Tag;

public interface TagRepository extends JpaRepository<Tag, Long> {
}