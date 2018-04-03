package com.projet.dating.controller;

import com.projet.dating.entities.User;
import com.projet.dating.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    private  UserService us;

    public UserController(UserService us){
        this.us =us;
    }



    @RequestMapping(value = "/listeUsers")
    @ResponseBody
    public List<User> getListeUsers(){
        return us.getAllUsers();
    }





}
