package com.springBoot.rest.webservices.restfulwebservices.Exception;

import java.util.Date;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

//Across all files if this wants to be shared
@ControllerAdvice
//For Rest request and response below annotation is used.
@RestController
public class CustomResponseException extends ResponseEntityExceptionHandler  {
	
	//Used to define which type of exception you want to handle
	@ExceptionHandler(Exception.class)
	public final ResponseEntity<Object> handleAllExceptions(Exception ex, WebRequest request) {
		
		
	ExceptionResponse exceptionResponse =	new ExceptionResponse(new Date(), ex.getMessage(), request.getDescription(false));
		return new ResponseEntity(exceptionResponse,HttpStatus.INTERNAL_SERVER_ERROR) ;
		
		
		
	}
	
	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex1, HttpHeaders headers, HttpStatus status, WebRequest request1) {
		
		ExceptionResponse exceptionResponse1 = new ExceptionResponse(new Date(),"Validation Failed",ex1.getBindingResult().toString());

		return new ResponseEntity(exceptionResponse1,HttpStatus.BAD_REQUEST);
	}
	
	
}
