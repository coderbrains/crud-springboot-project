package com.crud.demo.enums;

import lombok.Getter;

public enum ResponseEnum {

	RECORD_NOT_FOUND(102, "Record not found"), ROLE_NOT_VALID(103, "Invalid Role");

	private @Getter int respCode;
	private @Getter String description;

	private ResponseEnum(int respCode, String description) {
		this.respCode = respCode;
		this.description = description;
	}
}
