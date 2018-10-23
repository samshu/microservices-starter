package com.aathif.learning.microservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aathif.learning.microservice.data.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
