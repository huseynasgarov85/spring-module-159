package com.example.springmodule159.dao;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorsRepository extends JpaRepository<AuthorEntity, Long> {
}
