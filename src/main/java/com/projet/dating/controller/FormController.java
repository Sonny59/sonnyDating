package com.projet.dating.controller;

import com.projet.dating.entities.Address;
import com.projet.dating.entities.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FormController {

    @GetMapping("/registration")
    public String getForm(ModelMap mm){
        mm.addAttribute("user",new User());
        mm.addAttribute("address",new Address());
         return "registration";

    }


}
