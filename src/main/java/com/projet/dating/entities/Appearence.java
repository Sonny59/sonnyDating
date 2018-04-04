package com.projet.dating.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Table(name = "apparence")
@Entity
public class Appearence {


    @OneToMany(mappedBy = "app")
    private List<User> usersList;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idApp;

    @NotNull
    @Column(name = "groupe_ethnique",length = 25)
    private String etnicGroup;

    @NotNull
    @Column(name = "taille",length = 3)
    private Integer length;

    @NotNull
    @Column(name = "couleur_yeux",length = 25)
    private String eyes;

    @NotNull
    @Column(name = "couleur_cheveux",length = 25)
    private String hair;

    @NotNull
    @Column(name = "type_cheveux",length = 25)
    private String hairType;

    @NotNull
    @Column(name = "poids")
    private Float weight;

    public Appearence() {
    }

    public Appearence(@NotNull Integer length, @NotNull String etnicGroup,@NotNull String eyes, @NotNull String hair, @NotNull String hairType, @NotNull Float weight) {
        this.etnicGroup = etnicGroup;
        this.length = length;
        this.eyes = eyes;
        this.hair = hair;
        this.hairType = hairType;
        this.weight = weight;
    }

    public Long getIdApp() {
        return idApp;
    }

    public void setIdApp(Long idApp) {
        this.idApp = idApp;
    }

    public String getEtnicGroup() {
        return etnicGroup;
    }

    public void setEtnicGroup(String etnicGroup) {
        this.etnicGroup = etnicGroup;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public String getEyes() {
        return eyes;
    }

    public void setEyes(String eyes) {
        this.eyes = eyes;
    }

    public String getHair() {
        return hair;
    }

    public void setHair(String hair) {
        this.hair = hair;
    }

    public String getHairType() {
        return hairType;
    }

    public void setHairType(String hairType) {
        this.hairType = hairType;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }
}
