package com.cg.ems.service;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.cg.ems.dto.EmployeeDto;
import com.cg.ems.exception.EmployeeException;

public interface IEmployeeService {
	public List<EmployeeDto>getAllEmployees();
	public EmployeeDto addEmployee(@RequestBody EmployeeDto emp);
	public EmployeeDto getEmployeeById(@PathVariable ("id") int id) throws EmployeeException;
	public EmployeeDto updateEmployee(@RequestBody EmployeeDto emp);
	public void deleteEmployee(@PathVariable ("id") int id);
	public int getEmployeeCount();
	
}
