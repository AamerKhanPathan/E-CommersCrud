package com.bikkadit.crud_operation.controller;

import com.bikkadit.crud_operation.entity.User;
import com.bikkadit.crud_operation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @DeleteMapping("deleteUser/{userId}")
    public ResponseEntity<User> deleteUser(@PathVariable Long userId){
        User finduser = this.service.finduser(userId);


        this.service.deleteUser(finduser);

       return new ResponseEntity<User>(finduser,HttpStatus.OK);

    }

    @GetMapping("/getUser/{userId}")
    public ResponseEntity<User> getUser(@PathVariable Long userId){
        User finduser = this.service.finduser(userId);
        return  new ResponseEntity<User>(finduser,HttpStatus.OK);
    }

    @GetMapping("/getUsers")
    public ResponseEntity<List<User>> getAllUsers(){
        List<User> allUsers = this.service.findAllUsers();
        return  new ResponseEntity<List<User>>(allUsers,HttpStatus.OK);
    }

    @PutMapping("/updateUser")
    public ResponseEntity<User> updateUser(@RequestBody User user){

        User save= this.service.updateUser(user);

        return  new ResponseEntity<User>(save,HttpStatus.OK);

    }

}
