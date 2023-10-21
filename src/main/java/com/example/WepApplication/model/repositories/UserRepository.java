package com.example.WepApplication.model.repositories;

import com.example.WepApplication.model.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
