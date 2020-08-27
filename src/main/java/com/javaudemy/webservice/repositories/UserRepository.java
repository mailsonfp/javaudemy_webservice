package com.javaudemy.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaudemy.webservice.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
