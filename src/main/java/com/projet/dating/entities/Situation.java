package com.projet.dating.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Table(name="situation")
@Entity
public class Situation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSituation;


    @NotNull
    @Column(name="statut_professionnel",length = 25)
    private String statutPro;

    @NotNull
    @Column(name="statut_personnel",length = 25)
    private String statutPerso;

    @NotNull
    @Column(name="nombre_enfants",length = 25)
    private Integer numbOfChildren;

    @NotNull
    @Column(name="orientation_sexuelle",length = 25)
    private String orientation;

    @NotNull
    @Column(name="fumeur",length = 25)
    private String smoking;

    @NotNull
    @Column(name="alcool",length = 25)
    private String alcool;

    public Situation() {
    }

    public Situation(@NotNull String statutPro, @NotNull String statutPerso, @NotNull Integer numbOfChildren, @NotNull String orientation, @NotNull String smoking, @NotNull String alcool) {
        this.statutPro = statutPro;
        this.statutPerso = statutPerso;
        this.numbOfChildren = numbOfChildren;
        this.orientation = orientation;
        this.smoking = smoking;
        this.alcool = alcool;
    }

    public Long getIdSituation() {
        return idSituation;
    }

    public void setIdSituation(Long idSituation) {
        this.idSituation = idSituation;
    }

    public String getStatutPro() {
        return statutPro;
    }

    public void setStatutPro(String statutPro) {
        this.statutPro = statutPro;
    }

    public String getStatutPerso() {
        return statutPerso;
    }

    public void setStatutPerso(String statutPerso) {
        this.statutPerso = statutPerso;
    }

    public Integer getNumbOfChildren() {
        return numbOfChildren;
    }

    public void setNumbOfChildren(Integer numbOfChildren) {
        this.numbOfChildren = numbOfChildren;
    }

    public String getOrientation() {
        return orientation;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }

    public String getSmoking() {
        return smoking;
    }

    public void setSmoking(String smoking) {
        this.smoking = smoking;
    }

    public String getAlcool() {
        return alcool;
    }

    public void setAlcool(String alcool) {
        this.alcool = alcool;
    }
}
