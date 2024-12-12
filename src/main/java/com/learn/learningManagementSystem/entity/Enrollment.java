package com.learn.learningManagementSystem.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Enrollment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private String enrollmentId;
	
	@Column(nullable = false)
	private String status;

}
