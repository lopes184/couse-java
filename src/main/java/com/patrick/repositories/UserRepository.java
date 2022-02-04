package com.patrick.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.patrick.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
