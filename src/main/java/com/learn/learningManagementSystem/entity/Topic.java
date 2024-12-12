package com.learn.learningManagementSystem.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Topic {
	
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private String topicId;
	
	@Column(nullable=false)
	private String title;
	
	@Column
	private String content;
	
	@ManyToOne
	private Course course;

}
