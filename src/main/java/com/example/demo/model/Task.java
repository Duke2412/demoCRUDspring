package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Task {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    @Column(nullable = false)
    private String name;

    private String description;

    private String avatar;

    public Task() {
    }

    public Task(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Task(Long id, String name, String description, String avatar) {
        this.name = name;
        this.description = description;
        this.id = id;
        this.avatar = avatar;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}
