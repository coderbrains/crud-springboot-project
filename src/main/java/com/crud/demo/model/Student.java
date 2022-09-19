package com.crud.demo.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.crud.demo.constants.StudentEntityConstant;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.ToString;

@Entity
@Data
@ToString
@Table(name = StudentEntityConstant.TABLE_NAME)
public class Student implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = StudentEntityConstant.ID_NAME, nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = StudentEntityConstant.STUDENT_NAME, length = 20, nullable = false)
	@NotBlank(message = StudentEntityConstant.NAME_BLANK)
	@Size(min = 3, max = 20, message = StudentEntityConstant.NAME_SIZE_BIND)
	@Pattern(regexp = StudentEntityConstant.NAME_REGEX, message = StudentEntityConstant.NAME_PATTERN)
	private String name;

	@Column(name = StudentEntityConstant.DEPARTMENT, length = 20, nullable = false)
	@NotBlank(message = StudentEntityConstant.DEPARTMENT_REQUIRED)
	@Size(min = 2, max = 20, message = StudentEntityConstant.DEPARTMENT_BIND_SIZE)
	@Pattern(regexp = StudentEntityConstant.DEPARTMENT_PATTERN, message = StudentEntityConstant.DEPARTMENT_PATTERN)
	private String department;

	@Column(unique = true, name = StudentEntityConstant.ROLL_NO, length = 20, nullable = false)
	@NotBlank(message = StudentEntityConstant.ROLL_REQUIRED)
	@Size(min = 10, max = 20, message = StudentEntityConstant.ROLL_BIND_SIZE)
	@Pattern(regexp = StudentEntityConstant.ROLL_PATTERN, message = StudentEntityConstant.ROLL_PATTER_MESSAGE)
	private String rollNo;

	@ManyToOne
	private Course courses;

	@Column(name = StudentEntityConstant.EMAIL, unique = true, length = 50)
	@Email(message = StudentEntityConstant.EMAIL_VALID)
	@Size(min = 5, max = 100, message = StudentEntityConstant.EMAIL_BIND_SIZE)
	@NotBlank(message = StudentEntityConstant.EMAIL_REQUIRED)
	private String email;

	@Column(name = StudentEntityConstant.FATHER_NAME, length = 30)
	@NotBlank(message = StudentEntityConstant.FATHER_NAME_REQUIRED)
	@Size(min = 5, max = 30, message = StudentEntityConstant.FATHER_NAME_SIZE_BOUND)
	@Pattern(regexp = StudentEntityConstant.FATHER_NAME_REGEX, message = StudentEntityConstant.FATHER_NAME_PATTERN)
	private String fatherName;

	@Embedded
	@Valid
	@AttributeOverrides({ @AttributeOverride(name = "city", column = @Column(name = "district")),
			@AttributeOverride(name = "village", column = @Column(name = "village")),
			@AttributeOverride(name = "pinCode", column = @Column(name = "zipCode")) })
	private Address address;

	@Transient
	@JsonIgnore
	private String registrationNumber;

	@Column(name = "addmission_date")
	@Temporal(TemporalType.DATE)
	private Date addmissionDate;

	@Column(name = StudentEntityConstant.MOBILE_NUMBER, length = 13, unique = true)
	@Size(min = 10, max = 13, message = StudentEntityConstant.MOBILE_NUMBER_SIZE_BOUND)
	@NotBlank(message = StudentEntityConstant.MOBILE_NUMBER_REQUIRED)
	@Pattern(regexp = StudentEntityConstant.REGEXP, message = StudentEntityConstant.MOBILE_NUMBER_PATTERN) // NOSONAR
	private String mobileNumber;

	private boolean active;

	@ElementCollection
	@Column(name = StudentEntityConstant.NICK_NAME)
	private List<String> nickNames = new ArrayList<String>();

}
