package com.projet.dating.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Table(name = "centre_interet")
@Entity
public class Hobbie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idHob;

    @NotNull
    @Column(name = "sport",length = 25)
    private String sport;

    @NotNull
    @Column(name = "loisir",length = 25)
    private String leisure;

    public Hobbie() {
    }

    public Hobbie(@NotNull String sport, @NotNull String leisure) {
        this.sport = sport;
        this.leisure = leisure;
    }

    public Long getIdHob() {
        return idHob;
    }

    public void setIdHob(Long idHob) {
        this.idHob = idHob;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public String getLeisure() {
        return leisure;
    }

    public void setLeisure(String leisure) {
        this.leisure = leisure;
    }
}
