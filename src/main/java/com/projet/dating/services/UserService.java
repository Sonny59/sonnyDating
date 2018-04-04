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
    public void setAllUsers(List<User> usersList){
        ur.saveAll(usersList);
    }
    public User saveUser(User user){ return ur.save(user); }

    
    //CRUD
    public Optional<User> findById(String emailUser){
        return ur.findById(emailUser);
    }

    public void delete(User u){
        ur.delete(u);
    }

    public void create(User u){
        ur.save(u);
    }

    public void update(User u) { ur.save(u);}
}
