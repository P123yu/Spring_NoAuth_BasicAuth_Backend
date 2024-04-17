package com.security.repository;


import com.security.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface UserRepository extends JpaRepository<UserModel,Long> {
               Optional<UserModel> findByuserName(String userName);

}
