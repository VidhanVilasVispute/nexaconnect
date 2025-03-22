package com.nexaconnect.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.nexaconnect.NexaconnectApplication;
import com.nexaconnect.entities.User;
import com.nexaconnect.forms.UserForm;
import com.nexaconnect.services.UserService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class PageController {

    private final NexaconnectApplication nexaconnectApplication;

    @Autowired
    private UserService  userService;


    PageController(NexaconnectApplication nexaconnectApplication) {
        this.nexaconnectApplication = nexaconnectApplication;
    }

 

    @GetMapping("/")
    public String index() {
        return "redirect:/home";
    }

    @RequestMapping("/home")
    public String home(Model model) {
        System.out.println("Home page handler");
        // sending data to view
        model.addAttribute("name", "Substring Technologies");
        model.addAttribute("youtubeChannel", "Learn Code With Durgesh");
        model.addAttribute("githubRepo", "https://github.com/learncodewithdurgesh/");
        return "home";
    }

    // about route

    @RequestMapping("/about")
    public String aboutPage(Model model) {
        model.addAttribute("isLogin", true);
        System.out.println("About page loading");
        return "about";
    }

    // services

    @RequestMapping("/services")
    public String servicesPage() {
        System.out.println("services page loading");
        return "services";
    }

    // contact page

    @GetMapping("/contact")
    public String contact() {
        return new String("contact");
    }

    // this is showing login page
    @GetMapping("/login")
    public String login() {
        return new String("login");
    }

    // registration page
    @GetMapping("/register")
    public String register(Model model) {

        UserForm userForm = new UserForm();
       
        // userForm.setName("Durgesh");
        // userForm.setAbout("This is about : Write something about yourself");
        model.addAttribute("userForm", userForm);

        return "register";
    }

    // processing register

    @RequestMapping(value = "/do-register", method = RequestMethod.POST)
    public String processRegister(@Valid @ModelAttribute UserForm userForm,BindingResult rBindingResult) {
        System.out.println("Processing registration");
        // fetch form data
        // UserForm
        System.out.println(userForm);

        if (rBindingResult.hasErrors()){
            return "register" ;
        }

       User user= User.builder()
       .name(userForm.getName())
       .about(userForm.getAbout())
       .email(userForm.getEmail())
       .password(userForm.getPassword())
       .phoneNumber(userForm.getPhoneNumber())
       .profilePic("https://www.learncodewithdurgesh.com/_next/image?url=%2F_next%2Fstatic%2Fmedia%2Fdurgesh_sir.35c6cb78.webp&w=1920&q=75")
       .build();

        User saveUser =userService.saveUser(user);

       
        return "redirect:/login";
    }

}