package com.example.userservice.repositories;

import com.example.userservice.entities.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.GetMapping;

public interface UserRepository extends CrudRepository<User, Long> {

    @Query( value = "SELECT * FROM user WHERE cognitoID =?1", nativeQuery = true)
    User findByCognitoID(String cognitoID);
}
