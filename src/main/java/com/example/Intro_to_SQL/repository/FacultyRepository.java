package com.example.Intro_to_SQL.repository;

import com.example.Intro_to_SQL.model.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface FacultyRepository extends JpaRepository<Faculty, Long> {

    Collection<Faculty> findByNameIgnoreCase(String name);

    Collection<Faculty> findByColorIgnoreCase(String color);

}