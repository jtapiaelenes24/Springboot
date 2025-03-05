package com.jt24.springboot.webapp.springboot_web.controllers;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
// import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jt24.springboot.webapp.springboot_web.models.User;
import com.jt24.springboot.webapp.springboot_web.models.dto.UserDto;

@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping(path = "/details")
    public UserDto details() {

        User user = new User("Jordi", "Tapia");

        UserDto userDto = new UserDto();
        userDto.setUser(user);
        userDto.setTitle("Hello World, Spring Boot!");

        return userDto;
    }

    @GetMapping("/list")
    public List<User> list() {
        User user = new User("Peter", "Griffin");
        User user2 = new User("Homer", "Simpson");
        User user3 = new User("Joe", "Swanson");

        List<User> users = Arrays.asList(user, user2, user3);
        // List<User> users = new ArrayList<>();
        // users.add(user);
        // users.add(user2);
        // users.add(user3);

        return users;
    }

    @GetMapping(path = "/details-map")
    public Map<String, Object> detailsMap() {

        User user = new User("Jordi", "Tapia");

        Map<String, Object> body = new HashMap<>();

        body.put("title", "Hello World, Spring Boot!");
        body.put("user", user);

        return body;
    }
}