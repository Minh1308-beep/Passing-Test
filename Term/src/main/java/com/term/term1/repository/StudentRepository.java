package com.term.term1.repository;

import com.term.term1.entity.Student;
import com.term.term1.entity.StudentDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    @Query("SELECT new com.midterm.midterm1.entity.StudentDTO(p.id, p.name, p.major, p.classRoom.name) FROM Student p")
    List<StudentDTO> findAllStudents();
}
