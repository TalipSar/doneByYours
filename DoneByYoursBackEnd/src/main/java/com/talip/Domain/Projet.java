package com.talip.Domain;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name = "Projet")
public class Projet {

        // ATTRIBUTS

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String name;
        private String adress;
        private LocalDate date;

        @ManyToMany(mappedBy = "projet")
        private Set<Ouvrier> ouvrier;


        // CONSTRUCTEURS

        public Projet() {
        }

    public Projet(String name, String adress, LocalDate date) {
        this.name = name;
        this.adress = adress;
        this.date = date;
    }

    public Projet( Long id, String name, String adress, LocalDate date) {
        this.name = name;
        this.adress = adress;
        this.date = date;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }



    @Override
    public String toString() {
        return "Projet{" +
                "name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                ", date=" + date +
                ", id=" + id +
                '}';
    }
}
