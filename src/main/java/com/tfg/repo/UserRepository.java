package com.tfg.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tfg.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
