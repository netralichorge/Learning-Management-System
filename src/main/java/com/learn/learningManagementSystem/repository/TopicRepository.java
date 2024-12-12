package com.learn.learningManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.learningManagementSystem.entity.Topic;

public interface TopicRepository extends JpaRepository<Topic, String>{
}
