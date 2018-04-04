package com.projet.dating.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Table(name = "centre_interet")
@Entity
public class Hobby {

    @ManyToMany(mappedBy = "hobbiesList")
    private List<User> usersList;

    @ManyToMany
    private List<Multimedia> multisList;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idHob;

    @NotNull
    @Column(name = "sport",length = 25)
    private String sport;

    @NotNull
    @Column(name = "loisir",length = 25)
    private String leisure;

    public Hobby() {
    }

    public Hobby(@NotNull String sport, @NotNull String leisure) {
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
