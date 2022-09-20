package com.crud.demo.constants;

public class AddressEntityConstant {
	public static final String CITY_REQUIRED = "city is a required field.";
	public static final String CITY_BIND_SIZE = "size of city would be 5 to 20.";
	public static final String CITY_PATTERN = "city name can only contains the alphabets";
	public static final String REGEXP = "[a-zA-Z][a-zA-Z]*";
	public static final String VILLAGE_REQUIRED = "village is a reqiured field";
	public static final String VILLAGE_BIND_SIZE = "Village name should only between 5 to 20";
	public static final String VILLAGE_PATTERN = "Village name should only contains the alphabets.";
	public static final String REGEXP_VILLAGE = "[a-zA-Z][a-zA-Z]*";
	public static final String ZIP_REQUIRED = "Village is a required field.";
	public static final String ZIP_BIND_SIZE = "Village must be of 6 digit.";
	public static final String ZIP_PATTERN = "zip should contain the digits only.";
	public static final String REGEXP_PIN = "^[0-9]{1}[0-9]{2}\\s{0,1}[0-9]{3}$";

}
