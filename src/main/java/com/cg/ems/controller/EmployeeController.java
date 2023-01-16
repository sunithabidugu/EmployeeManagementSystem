package com.cg.ems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.cg.ems.dto.EmployeeDto;
import com.cg.ems.exception.EmployeeException;
import com.cg.ems.service.IEmployeeServiceImpl;

import jakarta.validation.Valid;


@RestController
@RequestMapping("/ems")
public class EmployeeController {
	@Autowired
	IEmployeeServiceImpl service;
	
	@GetMapping("/getallemployees")
	public List<EmployeeDto>getAllEmployees(){
		return service.getAllEmployees();
	}
	
	@PostMapping("/addemployee")
	public EmployeeDto addEmployee(@Valid @RequestBody EmployeeDto emp) {
		return service.addEmployee(emp);
	}
	@GetMapping("/getemployee/{id}")
	public EmployeeDto getEmployeeById(@PathVariable ("id") int id) throws EmployeeException{
		return service.getEmployeeById(id);
	}
	
	@PutMapping("/updateemployee")
	public EmployeeDto updateemployee(@Valid @RequestBody EmployeeDto emp) {
		return service.updateEmployee(emp);
	}
	@DeleteMapping("/delemployee/{id}")
	public void deleteEmployee(@PathVariable ("id") int id) {
		this.service.deleteEmployee(id);
		
	}
	@GetMapping("/countemployee")
	public int getEmployeeCount() {
		return service.getEmployeeCount();
	}
	

}
