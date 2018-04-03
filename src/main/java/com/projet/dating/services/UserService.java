package com.projet.dating.services;

import com.projet.dating.entities.User;
import com.projet.dating.repositories.UserRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepos ur;

    @Autowired
    public UserService(UserRepos ur) {
        this.ur = ur;
    }

    public List<User> getAllUsers(){
        return ur.findAll();
    }

    
    //CRUD
    public Optional<User> findById(String emailUser){
        return ur.findById(emailUser);
    }

    public void delete(User User){
        ur.delete(User);
    }

    public void create(User User){
        ur.save(User);
    }

    public void update(User User) { ur.save(User);}
}
