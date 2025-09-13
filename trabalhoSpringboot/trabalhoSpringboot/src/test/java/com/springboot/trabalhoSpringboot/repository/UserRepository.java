package com.springboot.trabalhoSpringboot.repository;

import com.springboot.trabalhoSpringboot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}