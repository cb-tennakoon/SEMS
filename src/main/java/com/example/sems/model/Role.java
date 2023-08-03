package com.example.sems.model;

import jakarta.persistence.*;
import jakarta.transaction.Transactional;

import java.util.Collection;
import java.util.Set;

@Entity
@Transactional
@Table(name = "role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @ManyToMany(mappedBy = "roles")
    Collection<User> roles;
    public Role(){

    }

    public Role(String name){
        super();
        this.name = name;
    }

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
}
