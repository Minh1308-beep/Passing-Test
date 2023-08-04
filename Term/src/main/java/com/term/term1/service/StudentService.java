package com.term.term1.service;

import com.term.term1.entity.StudentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import com.term.term1.repository.StudentRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public List<StudentDTO> getAllStudent() {
        return studentRepository.findAllStudents();
    }

}
