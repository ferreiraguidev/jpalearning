package com.example.jpalearning.controller;

import com.example.jpalearning.model.User;
import com.example.jpalearning.model.UserPostRequestBody;
import com.example.jpalearning.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    @ResponseStatus(HttpStatus.OK)
    public List<User> listAll() {
        return userService.ListAllUsers();
    }

    @PostMapping("/users")
    public ResponseEntity<User> save(@RequestBody UserPostRequestBody userPostRequestBody) {
        return new ResponseEntity<>(userService.save(userPostRequestBody), HttpStatus.CREATED);


    }
}
