package com.crud.demo.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExceptionDetails {
	private String timeStamp;
	private int statusCode;
	private String message;
	private String path;
}
