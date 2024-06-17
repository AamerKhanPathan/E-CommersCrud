package com.bikkadit.crud_operation.service;

import com.bikkadit.crud_operation.entity.User;

import java.util.List;
import java.util.Optional;


public interface UserService {
   User createUser(User user);

    void  deleteUser(User user);

    User finduser(Long id);


}
