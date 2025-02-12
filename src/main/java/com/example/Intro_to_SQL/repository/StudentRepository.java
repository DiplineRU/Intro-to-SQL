package com.example.Intro_to_SQL.repository;

import com.example.Intro_to_SQL.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    Student findByNameIgnoreCase(String name);

    Collection<Student> findStudentByNameContainsIgnoreCase(String name);

    Collection<Student> findAllByNameContainsIgnoreCase(String namePart);

    Collection<Student> findByAgeBetween(int minAge, int maxAge);



}
