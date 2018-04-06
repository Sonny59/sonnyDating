package com.projet.dating.entities;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Table(name = "photo")
@Entity
public class Picture {

    @ManyToOne
    @JoinColumn(name = "email")
    private User user;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_photo")
    private Long idPicture;

    @NotNull
    @NotBlank
    @Column(name = "url_photo")
    private String link;


    @Column(name = "note")
    private Integer note;

    public Picture() {
    }

    public Picture(@NotNull @NotBlank String link, @NotNull @NotBlank Integer note) {
        this.link = link;
        this.note = note;
    }

    public Long getIdPicture() {
        return idPicture;
    }

    public void setIdPicture(Long idPicture) {
        this.idPicture = idPicture;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Integer getNote() {
        return note;
    }

    public void setNote(Integer note) {
        this.note = note;
    }


}
