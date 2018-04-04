package com.projet.dating.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Table(name = "multimedia")
@Entity
public class Multimedia {

    @ManyToMany(mappedBy = "multisList")
    private List<Hobby> hobbiesList;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMulti;

    @NotNull
    @Column(name = "type_media",length = 25)
    private String mediaType;

    @NotNull
    @Column(name = "genre",length = 25)
    private String kindOfMedia;

    @NotNull
    @Column(name = "titre",length = 25)
    private String title;

    @NotNull
    @Column(name = "artiste",length = 25)
    private String artist;

    public Multimedia() {
    }

    public Multimedia(@NotNull String mediaType, @NotNull String kindOfMedia, @NotNull String title, @NotNull String artist) {
        this.mediaType = mediaType;
        this.kindOfMedia = kindOfMedia;
        this.title = title;
        this.artist = artist;
    }

    public Long getIdMulti() {
        return idMulti;
    }

    public void setIdMulti(Long idMulti) {
        this.idMulti = idMulti;
    }

    public String getMediaType() {
        return mediaType;
    }

    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    public String getKindOfMedia() {
        return kindOfMedia;
    }

    public void setKindOfMedia(String kindOfMedia) {
        this.kindOfMedia = kindOfMedia;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
}
