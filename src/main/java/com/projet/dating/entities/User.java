package com.projet.dating.entities;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "utilisateur")
public class User implements Serializable{

    @OneToMany(mappedBy = "user")
    private List<Picture> picturesList;
    @ManyToOne
    @JoinColumn(name = "id_app")
    private Appearence app;
    @ManyToOne
    @JoinColumn(name = "id_situation")
    private Situation sit;
    @ManyToMany
    private List<Hobby> hobbiesList;
    @ManyToOne
    @JoinColumn(name = "id_adr")
    private Address adr;

    @ManyToMany(mappedBy = "usersList2")
    private List<User> usersList1;
    @ManyToMany
    private List<User> usersList2;






    @Id
    @Column(name = "email", length = 15)
    @NotNull
    private String emailUser;

    @Column(name = "sexe", length = 1)
    @NotNull
    private Character gender;

    @Column(name = "nom", length = 25)
    @NotNull
    private String lastName;

    @Column(name = "prenom", length = 50)
    @NotNull
    private String firstName;

    @Column(name = "date_de_naissance")
    @DateTimeFormat
    private String birthDate;

    @Column(name = "tel", length = 10)
    @NotNull
    private String phone;

    @Column(name = "pseudo", length = 15)
    @NotNull
    private String idUser;

    @Column(name = "mot_de_passe", length = 8)
    @NotBlank
    private String password;

    @Column(name = "description", length = 15)
    @NotBlank
    private String description;

    @Column(name = "type_utilisateur", length = 15)
    @NotNull
    private Integer userType;

    public User() {
    }

    public User(String emailUser, Character gender, String lastName, String firstName, String birthDate, String phone, String idUser, String password, String description, Integer userType) {
        this.emailUser = emailUser;
        this.gender = gender;
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthDate = birthDate;
        this.phone = phone;
        this.idUser = idUser;
        this.password = password;
        this.description = description;
        this.userType = userType;
    }

    public String getEmailUser() {
        return emailUser;
    }

    public void setEmailUser(String emailUser) {
        this.emailUser = emailUser;
    }

    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        idUser = idUser;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }
}
