package com.learn.learningManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.learningManagementSystem.entity.Course;

public interface CourseRepository extends JpaRepository<Course, String> {

}
