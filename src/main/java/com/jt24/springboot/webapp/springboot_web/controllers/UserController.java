package com.jt24.springboot.webapp.springboot_web.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.jt24.springboot.webapp.springboot_web.models.User;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model) {

        User user = new User("Jordi", "Tapia");
        user.setEmail("example@example.org");
        model.addAttribute("title", "Hello World, Spring Boot!");
        model.addAttribute("user", user);

        return "details";
    }

    @GetMapping("/list")
    public String list(ModelMap model) {

        model.addAttribute("title", "Users list:");
        return "list";
    }

    @ModelAttribute("users")
    public List<User> userModel() {
        return Arrays.asList(new User("Stewie", "Griffin"),
                new User("Brian", "Griffin", "braian@familyguy.com"),
                new User("Chris", "Griffin", "chris@familyguy.com"), new User("Louise", "Griffin"),
                new User("Meg", "Griffin"));
    }
}
