package com.crud.demo.constants;

public class StudentEntityConstant {

	public static final String TABLE_NAME = "Student_details";
	public static final String ID_NAME = "Student_ID";
	public static final String STUDENT_NAME = "Student_name";
	public static final String DEPARTMENT = "department";
	public static final String NAME_BLANK = "Student name cannot be blank.";
	public static final String NAME_SIZE_BIND = "Student name must be between 3 to 20.";
	public static final String NAME_REGEX = "[a-zA-Z][a-zA-Z]*([.a-zA-Z ])+";
	public static final String NAME_PATTERN = "Student name must only contains the alphabets and spaces.";
	public static final String DEPARTMENT_REQUIRED = "Department name is required.";
	public static final String DEPARTMENT_BIND_SIZE = "Department size should be between 2 to 20";
	public static final String DEPARTMENT_PATTERN = "Department name should only contains the alphabets and spaces.";
	public static final String DEPARTMENT_REGEX = "[a-zA-Z ]*";
	public static final String ROLL_NO = "roll_no";
	public static final String ROLL_REQUIRED = "roll_no is required field.";
	public static final String ROLL_BIND_SIZE = "Roll no must be between 10 to 20";
	public static final String ROLL_PATTERN = "[0-9]+";
	public static final String ROLL_PATTER_MESSAGE = "roll no must only contains the numeric keys.";
	public static final String EMAIL = "email";
	public static final String EMAIL_VALID = "Email should follow the official email pattern";
	public static final String EMAIL_BIND_SIZE = "Email should should be between 5 to 100 length";
	public static final String EMAIL_REQUIRED = "Email is a required field";
	public static final String FATHER_NAME = "father_name";
	public static final String FATHER_NAME_REQUIRED = "Father name is a required field.";
	public static final String FATHER_NAME_SIZE_BOUND = "Father name should be between 5 to 20";
	public static final String FATHER_NAME_REGEX = "[a-zA-Z][a-zA-Z]*([.a-zA-Z ])+";
	public static final String FATHER_NAME_PATTERN = "Father name should only contains the alphabets and spaces and dot.";
	public static final String MOBILE_NUMBER = "Mobile_number";
	public static final String MOBILE_NUMBER_SIZE_BOUND = "Mobile number should be between 10 to 13";
	public static final String MOBILE_NUMBER_REQUIRED = "Mobile number is a required field.";
	public static final String REGEXP = "(0|91)?[6-9][0-9]{9}";
	public static final String MOBILE_NUMBER_PATTERN = "Mobile number should follow the pattern.";
	public static final String NICK_NAME = "Nick_name";

}
