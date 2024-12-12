package com.learn.learningManagementSystem.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Course {
	
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private String courseId;
	
	@Column(nullable=false)
	private String courseName;
	
	@Column(nullable=false)
	private String description;
	
	@ManyToMany(mappedBy = "courses")
	private List<User> users;
	
	@OneToMany(cascade = {CascadeType.PERSIST,CascadeType.MERGE},mappedBy = "course")
	private List<Topic> topics;
	
	
	

}
