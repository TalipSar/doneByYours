package com.talip.Domain;


import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;


@Entity
@Table(name = "ouvriers")
public class Ouvrier {

    // ATTRIBUTS

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String lastName;
    private String profession;
    private String ville;

    @ManyToMany
//    @JoinTable(
//            name = "DoneByYours",
//            joinColumns = { @JoinColumn(name = "projet_name") },
//            inverseJoinColumns = { @JoinColumn(name = "ouvriers_name") }
//    )
    private Set<Projet> projet;


    // CONSTRUCTEUR

        public Ouvrier() {
    }

   public Ouvrier(String name, String profession, String ville) {
        this.name = name;
        this.profession = profession;
        this.ville = ville;
    }

    public Ouvrier(String name, String lastName, String profession, String ville) {
        this.name = name;
        this.lastName = lastName;
        this.profession = profession;
        this.ville = ville;
    }
    // GETTER - SETTER


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public String getProfession() {
        return profession;
    }

    public String getVille() {
        return ville;
    }


    public Long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }



    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Ouvrier{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", profession='" + profession + '\'' +
                ", ville='" + ville + '\'' +
                ", id=" + id +
                '}';
    }
}
