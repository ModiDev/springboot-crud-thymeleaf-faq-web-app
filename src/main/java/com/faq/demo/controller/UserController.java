package com.faq.demo.controller;

import com.faq.demo.model.User;
import com.faq.demo.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class UserController {
   //method handler
   @Autowired
   private UserService userService;
   //display list of users 
   @GetMapping("/")
   public String viewHomePage(Model model){
       model.addAttribute("listUsers", userService.getAllUsers());
       return "index";
   }
   @GetMapping("/showNewUserFaqForm")
   public String showNewUserFaqForm( Model model){
        //model attribute for form data
        User user = new User();
        model.addAttribute("user", user);
        return "new_user";
   }
   @PostMapping("/saveUserFaq")
   public String SaveFaq(@ModelAttribute("user") User user){
        //save user data to db

        userService.saveUser(user);
        return "redirect:/";
   }
}
