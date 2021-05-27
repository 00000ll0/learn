package com.example.my.controllers;

import com.example.my.domain.User;
import com.example.my.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.Map;


@Controller
public class UserController {
    @Autowired
    private UserRepo userRepo;

    @GetMapping("/userList")
    public String userList() {
        return "UserList";
    }

    @PostMapping("/userList")
    public String addUser(User user, Map<String, Object> model) {
        User userFromDb = userRepo.findByUsername(user.getUsername());
        return "redirect:/login";
    }

}