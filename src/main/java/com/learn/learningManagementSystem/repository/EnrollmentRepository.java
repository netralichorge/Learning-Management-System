package com.learn.learningManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.learningManagementSystem.entity.Enrollment;

public interface EnrollmentRepository extends JpaRepository<Enrollment, String> {

}
