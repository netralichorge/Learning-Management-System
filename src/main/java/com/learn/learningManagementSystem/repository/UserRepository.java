package com.learn.learningManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.learningManagementSystem.entity.User;

public interface UserRepository extends JpaRepository<User, String>{
	

}
