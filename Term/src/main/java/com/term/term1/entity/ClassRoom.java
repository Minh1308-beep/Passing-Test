
package com.term.term1.entity;

import jakarta.persistence.*;

@Entity
public class ClassRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    //Constructor
    public ClassRoom() {
    }
    public ClassRoom(Long id, String name) {
        this.id = id;
        this.name = name;
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
    public void setClassName(String className) {
        this.name = name;
    }
}
