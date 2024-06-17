package com.bikkadit.crud_operation.service;

import com.bikkadit.crud_operation.Response.ApiResponse;
import com.bikkadit.crud_operation.entity.User;
import com.bikkadit.crud_operation.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class UserServiceImpl  implements UserService{

    @Override
    public User finduser(Long id) {

        User user = this.userRepo.findById(id).orElseThrow(() -> new RuntimeException("user not found"));
        return user;
    }

    @Override
    public List<User> findAllUsers() {
        List<User> users = this.userRepo.findAll();
        return users;
    }

    @Override
    public User updateUser(User user) {
        Long userId = user.getUserId();
        User findUser = this.userRepo.findById(userId).orElseThrow(() -> new RuntimeException("user not found"));

        findUser.setUserName(user.getUserName());
        findUser.setUserAge(user.getUserAge());
        findUser.setUserAdd(user.getUserAdd());

        User save = userRepo.save(findUser);
        return save;
    }

    @Autowired
    private UserRepo userRepo;




    @Override
    public User createUser(User user) {
        User save = this.userRepo.save(user);

        return save;


    }

    @Override
    public void deleteUser(User user) {

        userRepo.delete(user);

    }

}
