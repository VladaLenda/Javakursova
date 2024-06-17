package com.university.vlada.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.university.vlada.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
}