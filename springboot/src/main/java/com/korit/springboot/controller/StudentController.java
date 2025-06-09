package com.korit.springboot.controller;

import com.korit.springboot.domain.entity.StudentEntity;
import com.korit.springboot.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/js/students")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @PostMapping
    public ResponseEntity<?> register(StudentEntity student) {
        return ResponseEntity.created(null).body(studentService.register(student));
    }
}












