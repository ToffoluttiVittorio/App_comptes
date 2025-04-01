package com.app_compta.models;

import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nom", nullable = false, length = 100)
    private String nom;

    @Column(name = "email", nullable = false, unique = true, length = 100)
    private String email;

    @Column(name = "mdp", nullable = false, length = 255)
    private String mdp;

    @ManyToMany
    @JoinTable(
        name = "users_categories",
        joinColumns = @JoinColumn(name = "id_user"),
        inverseJoinColumns = @JoinColumn(name = "id_categorie")
    )
    private Set<Categorie> categories;

    @ManyToMany
    @JoinTable(
        name = "users_sous_categories",
        joinColumns = @JoinColumn(name = "id_user"),
        inverseJoinColumns = @JoinColumn(name = "id_sous_categorie")
    )
    private Set<SousCategorie> sousCategories;

    @ManyToMany
    @JoinTable(
        name = "users_provenances",
        joinColumns = @JoinColumn(name = "id_user"),
        inverseJoinColumns = @JoinColumn(name = "id_provenance")
    )
    private Set<Provenance> provenances;

    // Constructeur sans argument
    public User() {
    }

    // Constructeur avec arguments
    public User(String nom, String email, String mdp) {
        this.nom = nom;
        this.email = email;
        this.mdp = mdp;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public Set<Categorie> getCategories() {
        return categories;
    }

    public void setCategories(Set<Categorie> categories) {
        this.categories = categories;
    }

    public Set<SousCategorie> getSousCategories() {
        return sousCategories;
    }

    public void setSousCategories(Set<SousCategorie> sousCategories) {
        this.sousCategories = sousCategories;
    }

    public Set<Provenance> getProvenances() {
        return provenances;
    }

    public void setProvenances(Set<Provenance> provenances) {
        this.provenances = provenances;
    }
}
