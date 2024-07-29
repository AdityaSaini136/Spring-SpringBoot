package com.exmp.exception;

import org.springframework.http.HttpStatus;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PgResponseException {
	
	private String message;
	private boolean success;
	private HttpStatus status;

}
