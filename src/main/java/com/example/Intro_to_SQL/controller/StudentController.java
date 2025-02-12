package com.example.Intro_to_SQL.controller;


import com.example.Intro_to_SQL.model.Student;
import com.example.Intro_to_SQL.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;


@RestController
@RequestMapping("Student")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("{id}") // GET
    public ResponseEntity<Student> getStudentInfo(@PathVariable Long id) {
        Student student = studentService.findStudent(id);
        if (student == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(student);
    }

    @PostMapping //POST
    public Student createStudent(@RequestBody Student student) {
        return studentService.createStudent(student);
    }

    @GetMapping //GET
    public ResponseEntity findStudent(@RequestParam(required = false) String name) {
        if (name != null && !name.isBlank()) {
            return ResponseEntity.ok(studentService.findByName(name));
        }
        return ResponseEntity.ok(studentService.getAllStudent());
    }

    @GetMapping("/getStudentByAge") //GET
    public ResponseEntity getStudentByAgeRange(@RequestParam int minAge,
                                               @RequestParam int maxAge) {
        return ResponseEntity.ok(studentService.findByAgeBetween(minAge, maxAge));
    }

    @PutMapping //PUT
    public ResponseEntity<Student> editStudent(@RequestBody Student student) {
        Student foundStudent = studentService.editStudent(student);
        if (foundStudent == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        return ResponseEntity.ok(foundStudent);
    }

    @DeleteMapping("{id}") //DELETE
    public ResponseEntity deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
        return ResponseEntity.ok().build();
    }
}

