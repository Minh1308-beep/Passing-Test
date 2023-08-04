package com.term.term1.controller;

import com.term.term1.entity.StudentDTO;
import com.term.term1.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    private final StudentRepository studentRepository;
    @Autowired
    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    // Test
    @GetMapping("/")
    public String test() {
        return "hello";
    }

    // Get all List students
    @GetMapping("/list")
    public List<StudentDTO> getAllStudent(){
        return studentRepository.findAllStudents();
    }
}
