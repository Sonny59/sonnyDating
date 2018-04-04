package com.projet.dating.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {


    @GetMapping("/index")
    public String vueAccueil() {
        return "/index";
    }


}
