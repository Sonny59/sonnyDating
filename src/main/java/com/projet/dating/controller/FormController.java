package com.projet.dating.controller;

import com.projet.dating.entities.*;
import com.projet.dating.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class FormController {

    @Autowired
    private UserService us;
    @Autowired
    private AddressService as;
    @Autowired
    private PictureService ps;
    @Autowired
    private SituationService ss;
    @Autowired
    private AppService apps;
    @Autowired
    private HobbyService hs;
    @Autowired
    private MultiService ms;


    @GetMapping("/registration")
    public String getFormRegistration(ModelMap mm){
        mm.addAttribute("user",new User());
        mm.addAttribute("address",new Address());
        mm.addAttribute("picture",new Picture());
        mm.addAttribute("situation",new Situation());
        mm.addAttribute("appearence",new Appearence());
        mm.addAttribute("hobby",new Hobby());
        mm.addAttribute("multimedia",new Multimedia());
         return "registration";
    }
    @PostMapping("/registration")
    public String postFormRegistration(@Valid @ModelAttribute(value = "user") User user, BindingResult userResult,
                               @Valid @ModelAttribute(value = "address") Address adr, BindingResult adrResult,
                               @Valid @ModelAttribute(value = "picture") Picture pict, BindingResult pictResult,
                               @Valid @ModelAttribute(value = "situation") Situation situation, BindingResult situationResult,
                               @Valid @ModelAttribute(value = "appearence") Appearence app, BindingResult appResult,
                               @Valid @ModelAttribute(value = "hobby") Hobby hob, BindingResult hobResult,
                               @Valid @ModelAttribute(value = "multimedia") Multimedia multi, BindingResult multiResult,
                               ModelMap mm) {
        mm.addAttribute("user",new User());
        mm.addAttribute("address",new Address());
        mm.addAttribute("picture",new Picture());
        mm.addAttribute("situation",new Situation());
        mm.addAttribute("appearence",new Appearence());
        mm.addAttribute("hobby",new Hobby());
        mm.addAttribute("multimedia",new Multimedia());
        us.saveUser(user);

        as.saveAddress(adr);

        ps.savePicture(pict);

        ss.saveSituation(situation);

        apps.saveAppearence(app);

        hs.saveHobby(hob);

        ms.saveMultimedia(multi);

        return "registration";
    }



}
