package com.projet.dating.services;

import com.projet.dating.entities.Multimedia;
import com.projet.dating.repositories.MultiRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MultiService {

    private final MultiRepos mr;

    @Autowired
    public MultiService(MultiRepos mr) {
        this.mr = mr;
    }

    public List<Multimedia> getAllMultimedia(){
        return mr.findAll();
    }
    public Multimedia saveMultimedia(Multimedia multi){ return mr.save(multi); }


    //CRUD
    public Optional<Multimedia> findById(Long idMulti){
        return mr.findById(idMulti);
    }

    public void delete(Multimedia multi){
        mr.delete(multi);
    }

    public void create(Multimedia multi){
        mr.save(multi);
    }

    public void update(Multimedia multi) { mr.save(multi);}
}
