package org.example.cadastrousers.controller;

import org.example.cadastrousers.model.User;
import org.example.cadastrousers.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    List<User> create(@RequestBody User user) {
        return userService.create(user);
    }

    @GetMapping
    List<User> list() {
        return userService.list();
    }

    @PutMapping
    List<User> update(@RequestBody User user) {
        return userService.update(user);
    }

    @DeleteMapping("/{id}")
    List<User> delete(@PathVariable("id") Long id){
        return userService.delete(id);
    }
}
