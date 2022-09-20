package com.crud.demo.model;

import javax.persistence.Embeddable;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.crud.demo.constants.AddressEntityConstant;

import lombok.Data;

@Embeddable
@Data
public class Address {

	@NotBlank(message = AddressEntityConstant.CITY_REQUIRED)
	@Size(min = 5, max = 20, message = AddressEntityConstant.CITY_BIND_SIZE)
	@Pattern(regexp = AddressEntityConstant.REGEXP, message = AddressEntityConstant.CITY_PATTERN) // NOSONAR
	String city;

	@NotBlank(message = AddressEntityConstant.VILLAGE_REQUIRED)
	@Size(min = 5, max = 20, message = AddressEntityConstant.VILLAGE_BIND_SIZE)
	@Pattern(regexp = AddressEntityConstant.REGEXP_VILLAGE, message = AddressEntityConstant.VILLAGE_PATTERN) // NOSONAR
	String village;

	@NotBlank(message = AddressEntityConstant.ZIP_REQUIRED)
	@Size(max = 6, min = 6, message = AddressEntityConstant.ZIP_BIND_SIZE)
	@Pattern(regexp = AddressEntityConstant.REGEXP_PIN, message = AddressEntityConstant.ZIP_PATTERN) // NOSONAR
	String pinCode;

}
