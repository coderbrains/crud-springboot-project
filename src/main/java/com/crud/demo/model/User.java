package com.crud.demo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.crud.demo.constants.UserValidation;

import lombok.Data;
import lombok.ToString;

@Entity
@Data
@ToString
@Table(name = "users")
public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "userId", updatable = false, nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "userName", nullable = false, length = 20, unique = true)
	@NotBlank(message = UserValidation.USERNAME_REQUIRED)
	@Size(min = 10, max = 20, message = UserValidation.USERNAME_BINDSIZE)
	@Pattern(regexp = UserValidation.USERNAME_PATTERN, message = UserValidation.PATTERN_MESSAGE)
	private String userName;

	@Column(name = "password", length = 20, nullable = false)
	@NotBlank(message = UserValidation.PASSWORD_REQUIRED)
	@Size(min = 8, max = 20, message = UserValidation.PASSWORD_BIND_SIZE)
	@Pattern(regexp = UserValidation.PASSWORD_PATTERN, message = UserValidation.PASSWORD_PATTERN_MESSAGE)
	private String password;

	@Column(name = "user_role", length = 10, nullable = false)
	@NotBlank(message = UserValidation.ROLE_REQUIRED)
	@Size(min = 5, max = 10, message = UserValidation.ROLE_SIZE_BIND)
	@Pattern(regexp = UserValidation.ROLE_PATTERN, message = UserValidation.ROLE_PATTERN_MESSAGE)
	private String role;

	@Column(name = "is_active")
	private boolean active;
}
