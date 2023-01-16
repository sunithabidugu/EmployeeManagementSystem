package com.cg.ems.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class EMSExceptionHandler {
	
	
	//login
	
	@ExceptionHandler(UserException.class)
	public @ResponseBody EMSErrorInfo userIdException(UserException ce,HttpServletRequest req) {
	  
		String msg=ce.getMessage();
		String uri= req.getRequestURI();
		return new EMSErrorInfo(msg,uri,LocalDateTime.now());
	}
	
	//Department
	@ExceptionHandler(DepartmentException.class)
	public @ResponseBody EMSErrorInfo departIdException(DepartmentException ce, HttpServletRequest req) {
		String msg=ce.getMessage();
		String uri=req.getRequestURI();
		return new EMSErrorInfo(msg,uri,LocalDateTime.now());
	}
	
	
	//employee
	
	@ExceptionHandler(EmployeeException.class)
	public @ResponseBody EMSErrorInfo EmployeeException(EmployeeException ce, HttpServletRequest req) {
		String msg=ce.getMessage();
		String uri=req.getRequestURI();
		return new EMSErrorInfo(msg,uri,LocalDateTime.now());
	}
	//compliance
	
	@ExceptionHandler(ComplianceIdExistsException.class)
	public @ResponseBody EMSErrorInfo ComplianceIdExistsException(ComplianceIdExistsException ce,HttpServletRequest req){
		String msg = ce.getMessage();
		String uri = req.getRequestURI();
		//new EMSErrorInfo("400",ce.getMessage(),LocalDateTime.now());
		return new EMSErrorInfo(msg,uri,LocalDateTime.now());
	}
	
	
	@ExceptionHandler(RlNotExistsException.class)
	public @ResponseBody EMSErrorInfo RlNotExistsException(RlNotExistsException ce,HttpServletRequest req){
		String msg = ce.getMessage();
		String uri = req.getRequestURI();
		//new EMSErrorInfo("400",ce.getMessage(),LocalDateTime.now());
		return new EMSErrorInfo(msg,uri,LocalDateTime.now());
	}
	
	@ExceptionHandler(StatusIdExistsException.class)
	public @ResponseBody EMSErrorInfo StatusIdExistsException(StatusIdExistsException ce,HttpServletRequest req){
		String msg = ce.getMessage();
		String uri = req.getRequestURI();
		//new EMSErrorInfo("400",ce.getMessage(),LocalDateTime.now());
		return new EMSErrorInfo(msg,uri,LocalDateTime.now());
	}
	
	

}
