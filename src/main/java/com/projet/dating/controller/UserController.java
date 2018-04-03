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

    private  UserService us;

    @Autowired
    public UserController(UserService us){
        this.us =us;
    }

    private List<User> listeUsers = new ArrayList<>(Arrays.asList(
            new User("toto@gmail.com",'h',"Bobo","toto","1980-12-10","0612345678","MaitreToto","mpToto","toto description",1),
            new User("tata@gmail.com",'f',"Baba","tata","1990-08-25","0601020304","MaitreTata","mpTata","tata description",1),
            new User("titi@gmail.com",'f',"Bibi","titi","2000-05-06","0611121314","MaitreTiti","mpToto","titi description",1)
    ));

    @RequestMapping(value = "/listeUsers")
    @ResponseBody
    public List<User> getListeUsers(){
        return us.getAllUsers();
    }



}
