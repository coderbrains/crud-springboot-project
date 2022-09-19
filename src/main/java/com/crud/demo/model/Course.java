package com.crud.demo.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.crud.demo.constants.CourseEntityConstant;
import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Data;

@Entity
@Data
@Table(name = CourseEntityConstant.COURSE)
public class Course implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int courseId;

	@Column(length = 50, name = CourseEntityConstant.COLUMN_NAME, unique = true, nullable = false)
	@Size(min = 3, max = 15, message = CourseEntityConstant.BIND_SIZE)
	@NotBlank(message = CourseEntityConstant.REQUIRED)
	@Pattern(regexp = CourseEntityConstant.PATTERN)
	private String courseName;

	@OneToMany(mappedBy = CourseEntityConstant.MAPPING, fetch = FetchType.LAZY)
	@JsonBackReference
	private List<Student> students;

}
