package com.term.term1.entity;

import jakarta.persistence.*;

@Entity
@Table(name="student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="name")
    private String name;
    @Column(name="major")
    private String major;
    @ManyToOne
    private ClassRoom classRoom;

    //Constructor
    public Student() {
    }
    public Student(long id, String name, String major, ClassRoom classRoom) {
        this.id = id;
        this.name = name;
        this.major = major;
        this.classRoom = classRoom;
    }

    //Setter and Getter
    public long getId() {
        return id;
    }
    public void setId(long id) {
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
    public ClassRoom getClassRoom() {
        return classRoom;
    }
    public void setClassRoom(ClassRoom classRoom) {
        this.classRoom = classRoom;
    }
}
