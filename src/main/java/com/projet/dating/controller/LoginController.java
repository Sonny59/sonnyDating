package com.projet.dating.controller;

import com.projet.dating.entities.*;
import com.projet.dating.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;
import java.time.LocalDateTime;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String getLogin(ModelMap mm){
        mm.addAttribute("user",new User());
        return "login";
    }


    private final UserService us;

    @Autowired
    public LoginController(UserService us) {
        this.us = us;
    }

   /* @PostMapping("/login")
    public String login(@ModelAttribute User User, RedirectAttributes attributes, HttpSession httpSession) {
        User user = UserService.findUserByEmailAndPassword(User.getEmailUser(), User.getPassword());
        if (user != null) {
            this.session(httpSession, user);
            return "redirect:/";
        }
        return "redirect:/";
    }*/

    @GetMapping("/logout")
    public String logout(HttpSession httpSession){
        httpSession.invalidate();
        return "redirect:/";
    }

    public void session(HttpSession httpSession, User user){
        String sessionKey = "sonny";
        Object time = httpSession.getAttribute(sessionKey);
        if (time == null) {
            time = LocalDateTime.now();
            httpSession.setAttribute(sessionKey, time);
        }
        httpSession.setAttribute("email", user.getEmailUser());
        httpSession.setAttribute("pseudo", user.getIdUser());
        httpSession.setMaxInactiveInterval(30*60);
    }

}
