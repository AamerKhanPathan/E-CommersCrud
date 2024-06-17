package com.bikkadit.crud_operation.repository;

import com.bikkadit.crud_operation.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface UserRepo extends JpaRepository<User,Long> {


}
