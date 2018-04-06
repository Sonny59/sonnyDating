package com.projet.dating.services;

import com.projet.dating.entities.Picture;
import com.projet.dating.repositories.PictureRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PictureService {

    private final PictureRepos pr;

    @Autowired
    public PictureService(PictureRepos pr) {
        this.pr = pr;
    }

    public List<Picture> getAllPicture(){
        return pr.findAll();
    }
    public Picture savePicture(Picture Pict){ return pr.save(Pict); }


    //CRUD
    public Optional<Picture> findById(Long idPict){
        return pr.findById(idPict);
    }

    public void delete(Picture Pict){
        pr.delete(Pict);
    }

    public void create(Picture Pict){
        pr.save(Pict);
    }

    public void update(Picture Pict) { pr.save(Pict);}
}
