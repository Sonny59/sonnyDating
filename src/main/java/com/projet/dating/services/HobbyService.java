package com.projet.dating.services;

import com.projet.dating.entities.Hobby;
import com.projet.dating.repositories.HobbyRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HobbyService {

    private final HobbyRepos hr;

    @Autowired
    public HobbyService(HobbyRepos hr) {
        this.hr = hr;
    }

    public List<Hobby> getAllHobby(){
        return hr.findAll();
    }
    public Hobby saveHobby(Hobby hob){ return hr.save(hob); }


    //CRUD
    public Optional<Hobby> findById(Long idhob){
        return hr.findById(idhob);
    }

    public void delete(Hobby hob){
        hr.delete(hob);
    }

    public void create(Hobby hob){
        hr.save(hob);
    }

    public void update(Hobby hob) { hr.save(hob);}
}
