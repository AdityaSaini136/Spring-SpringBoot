package com.exm.execption;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomerExecptionHandler {
	
	@ExceptionHandler(ProductNotFoundExecption.class)
	public ResponseEntity<ErrorResponse> hendlerEmployeeNotFoundExecption(ProductNotFoundExecption pnf){
		ErrorResponse errorResponse = new ErrorResponse();
		errorResponse.setMsg(pnf.getMessage());
		errorResponse.setStatusCode(HttpStatus.NOT_FOUND.value());
		return  new ResponseEntity<ErrorResponse>(errorResponse, HttpStatus.NOT_FOUND);
	}
}