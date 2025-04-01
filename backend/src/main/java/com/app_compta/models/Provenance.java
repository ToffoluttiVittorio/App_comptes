package com.app_compta.models;

import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table(name = "provenances")
public class Provenance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nom", nullable = false, length = 100)
    private String nom;

    @Column(name = "description", length = 255)
    private String description;

    @ManyToMany(mappedBy = "provenances")
    private Set<User> users;

    // Constructeur sans argument
    public Provenance() {
    }

    // Constructeur avec arguments
    public Provenance(String nom, String description) {
        this.nom = nom;
        this.description = description;
    }

    // Getters & Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }
}
