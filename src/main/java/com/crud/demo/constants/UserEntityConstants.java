package com.crud.demo.constants;

public class UserEntityConstants {
	public static final String USERNAME_REQUIRED = "User name is required.";
	public static final String USERNAME_BINDSIZE = "Size of user name is between 8 to 20.";
	public static final String USERNAME_PATTERN = "[a-zA-Z][a-zA-Z0-9]*";
	public static final String PATTERN_MESSAGE = "Username can only start with a alphabet and the other character can be alphanumeric";
	public static final String PASSWORD_REQUIRED = "Pasword is a required field";
	public static final String PASSWORD_BIND_SIZE = "Password should be between 8 to 20 characters";
	public static final String PASSWORD_PATTERN_MESSAGE = "Password is not strong";
	public static final String PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*])(?=\\\\S+$).{8,}$";
	public static final String ROLE_REQUIRED = "Role is a required field";
	public static final String ROLE_SIZE_BIND = "Role should be in between 5 to 10";
	public static final String ROLE_PATTERN_MESSAGE = "Role can only contain the alphbets.";
	public static final String ROLE_PATTERN = "[a-zA-Z]*";

}
