package com.projet.dating.entities;

import com.projet.dating.enums.GenderUser;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
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
    private Situation situ;
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
    private String emailUser;

    @Enumerated(EnumType.STRING)
    @Column(name = "sexe",nullable = false)
    private GenderUser gender;

    @Column(name = "nom", length = 25)
    private String lastName;

    @Column(name = "prenom", length = 50)
    private String firstName;

    @Column(name = "date_de_naissance")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String birthDate;

    @Column(name = "tel", length = 10)
    //@Pattern(regexp = "^0[0-9]{9}$")
    private String phone;

    @Column(name = "pseudo", length = 15)
    private String idUser;

    @Column(name = "mot_de_passe", length = 8)
    private String password;

    @Column(name = "description", length = 15)
    private String description;

    @Column(name = "type_utilisateur", length = 15)
    private Integer userType;

    public User() {
    }

    public User(String emailUser, GenderUser gender, String lastName, String firstName, String birthDate, String phone, String idUser, String password, String description, Integer userType) {
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

    public GenderUser getGender() {
        return gender;
    }

    public void setGender(GenderUser gender) {
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

    public void setSituation(Situation situ) {
        this.situ = situ;
    }
}
