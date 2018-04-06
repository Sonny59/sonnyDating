package com.projet.dating.services;

import com.projet.dating.entities.Situation;
import com.projet.dating.repositories.SituationRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SituationService {

    private final SituationRepos sr;

    @Autowired
    public SituationService(SituationRepos sr) {
        this.sr = sr;
    }

    public List<Situation> getAllSituation(){
        return sr.findAll();
    }
    public Situation saveSituation(Situation Situ){ return sr.save(Situ); }


    //CRUD
    public Optional<Situation> findById(Long idSitu){
        return sr.findById(idSitu);
    }

    public void delete(Situation Situ){
        sr.delete(Situ);
    }

    public void create(Situation Situ){
        sr.save(Situ);
    }

    public void update(Situation Situ) { sr.save(Situ);}
}
