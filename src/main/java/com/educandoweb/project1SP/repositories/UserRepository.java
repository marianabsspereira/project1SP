package com.educandoweb.project1SP.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.project1SP.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}