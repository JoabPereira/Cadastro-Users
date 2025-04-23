package org.example.cadastrousers.controller;

import jakarta.validation.Valid;
import org.example.cadastrousers.model.User;
import org.example.cadastrousers.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    List<User> create(@RequestBody @Valid User user) {
        return userService.create(user);
    }

    @GetMapping
    List<User> list() {
        return userService.list();
    }

    @PutMapping("/{id}")
    List<User> update(@PathVariable Long id, @RequestBody User user) {
        user.setId(id);
        return userService.update(user);
    }

    @DeleteMapping("/{id}")
    List<User> delete(@PathVariable("id") Long id){
        return userService.delete(id);
    }
}