package com.crud.demo.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ApplicationException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	private final int code;
	private final String status;
}
