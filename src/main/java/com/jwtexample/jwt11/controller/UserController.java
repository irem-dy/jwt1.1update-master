package com.jwtexample.jwt11.controller;

import com.jwtexample.jwt11.entity.User;
import com.jwtexample.jwt11.service.classes.UserService;
import com.jwtexample.jwt11.service.interfaces.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {
    private IUserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<Object> save(@RequestBody User user){
        userService.save(user);
        return new ResponseEntity<>(user.toString() + " eklendi", HttpStatus.OK);
    }

    @GetMapping
    public List<User> findAll() {
        return userService.findAll();
    }

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id){
        return userService.findById(id);
    }

    @PutMapping
    public ResponseEntity<Object> update(@RequestBody User user){
        userService.update(user);
        return new ResponseEntity<>(user.toString() + " güncellendi", HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> delete(@PathVariable Long id){
        userService.delete(id);
        return new ResponseEntity<>(id + "'li kullanıcı silindi", HttpStatus.OK);
    }
}