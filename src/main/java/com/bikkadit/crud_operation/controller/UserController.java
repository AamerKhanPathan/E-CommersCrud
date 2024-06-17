package com.bikkadit.crud_operation.controller;

import com.bikkadit.crud_operation.entity.User;
import com.bikkadit.crud_operation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService service;

    @PostMapping("/createUser")
    public ResponseEntity<User> createUser(@RequestBody User user){

       User save= this.service.createUser(user);

       return  new ResponseEntity<User>(save,HttpStatus.OK);













    }
}
