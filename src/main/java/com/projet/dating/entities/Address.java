package com.projet.dating.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Table(name = "adresse")
@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAdr;

    @NotNull
    @Column(name = "code_postal",length = 5)
    private  Integer postalCode;

    @NotNull
    @Column(name = "ville",length = 50)
    private String city;

    @NotNull
    @Column(name = "numero")
    private Integer num;

    @NotNull
    @Column(name = "type_rue",length = 25)
    private String streetType;

    @NotNull
    @Column(name = "rue",length = 50)
    private String street;

    @NotNull
    @Column(name = "complement",length = 25)
    private String complt;

    @NotNull
    @Column(name = "prefixe",length = 25)
    private String prefix;

    public Address() {
    }

    public Address(@NotNull Integer postalCode, @NotNull String city, @NotNull Integer num, @NotNull String streetType, @NotNull String street, @NotNull String complt, @NotNull String prefix) {
        this.postalCode = postalCode;
        this.city = city;
        this.num = num;
        this.streetType = streetType;
        this.street = street;
        this.complt = complt;
        this.prefix = prefix;
    }

    public Long getIdAdr() {
        return idAdr;
    }

    public void setIdAdr(Long idAdr) {
        this.idAdr = idAdr;
    }

    public Integer getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(Integer postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getStreetType() {
        return streetType;
    }

    public void setStreetType(String streetType) {
        this.streetType = streetType;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getComplt() {
        return complt;
    }

    public void setComplt(String complt) {
        this.complt = complt;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }
}