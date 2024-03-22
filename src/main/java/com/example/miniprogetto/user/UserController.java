package com.example.miniprogetto.user;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class UserController {
    @Autowired
    private final UserService userService;
    @GetMapping("/users")
    public List<User> getUsers(){
        return userService.getUsers();
    }
}
