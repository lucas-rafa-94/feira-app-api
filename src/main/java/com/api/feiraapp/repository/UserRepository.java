package com.api.feiraapp.repository;

import com.api.feiraapp.model.UserModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserModel, Long> {
    UserModel findByEmailAndAndPassword(String email, String password);
    UserModel findByEmail(String email);
}
