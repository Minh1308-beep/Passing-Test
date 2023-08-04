package com.term.term1.entity;

import jakarta.persistence.*;

public class StudentDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String major;
    private String className;

    //Constructor
    public StudentDTO() {
    }
    public StudentDTO(Long id, String name, String major, String className) {
        this.id = id;
        this.name = name;
        this.major = major;
        this.className = className;
    }

    //Setter and Getter
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getMajor() {
        return major;
    }
    public void setMajor(String major) {
        this.major = major;
    }
    public String getClassName() {
        return className;
    }
    public void setClassroomName(String className) {
        this.className = className;
    }
}
