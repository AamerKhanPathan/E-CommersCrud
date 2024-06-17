package com.bikkadit.crud_operation.service;

import com.bikkadit.crud_operation.entity.User;
import com.bikkadit.crud_operation.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl  implements UserService{
    @Autowired
    private UserRepo userRepo;

    @Override
    public User createUser(User user) {
        User save = this.userRepo.save(user);

        return save;


    }

}
