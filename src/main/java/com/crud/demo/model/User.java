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

import com.crud.demo.constants.UserEntityConstants;

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
	@NotBlank(message = UserEntityConstants.USERNAME_REQUIRED)
	@Size(min = 10, max = 20, message = UserEntityConstants.USERNAME_BINDSIZE)
	@Pattern(regexp = UserEntityConstants.USERNAME_PATTERN, message = UserEntityConstants.PATTERN_MESSAGE)
	private String userName;

	@Column(name = "password", length = 20, nullable = false)
	@NotBlank(message = UserEntityConstants.PASSWORD_REQUIRED)
	@Size(min = 8, max = 20, message = UserEntityConstants.PASSWORD_BIND_SIZE)
	@Pattern(regexp = UserEntityConstants.PASSWORD_PATTERN, message = UserEntityConstants.PASSWORD_PATTERN_MESSAGE)
	private String password;

	@Column(name = "user_role", length = 10, nullable = false)
	@NotBlank(message = UserEntityConstants.ROLE_REQUIRED)
	@Size(min = 5, max = 10, message = UserEntityConstants.ROLE_SIZE_BIND)
	@Pattern(regexp = UserEntityConstants.ROLE_PATTERN, message = UserEntityConstants.ROLE_PATTERN_MESSAGE)
	private String role;

	@Column(name = "is_active")
	private boolean active;
}
