package com.projet.dating.services;

import com.projet.dating.entities.Appearence;
import com.projet.dating.entities.Appearence;
import com.projet.dating.repositories.AppRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AppService {

    private final AppRepos appr;

    @Autowired
    public AppService(AppRepos appr) {
        this.appr = appr;
    }

    public List<Appearence> getAllAppearence(){
        return appr.findAll();
    }
    public Appearence saveAppearence(Appearence app){ return appr.save(app); }


    //CRUD
    public Optional<Appearence> findById(Long idapp){
        return appr.findById(idapp);
    }

    public void delete(Appearence app){
        appr.delete(app);
    }

    public void create(Appearence app){
        appr.save(app);
    }

    public void update(Appearence app) { appr.save(app);}
}
