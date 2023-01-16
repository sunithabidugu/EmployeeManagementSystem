package com.cg.ems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.ems.dto.DepartmentDto;
import com.cg.ems.exception.DepartmentException;
import com.cg.ems.service.IDepartmentService;

@RestController
@RequestMapping("/ems")
public class DepartmentController {
@Autowired
private IDepartmentService departmentService;
@GetMapping("/getAlldepartments")
public List<DepartmentDto> getAllDepartment(){
	return departmentService.getAllDepartment();
}
@PostMapping("/departments/add")
public String addDepartment(@RequestBody DepartmentDto dname) throws DepartmentException{
	departmentService.addDeparment(dname);
	return "Department Added Succefully";
	
}
@GetMapping("/getalldepartmentCount")
public int getAllDepartmentCount() {
	return departmentService.getAllDepartCount();
}
@DeleteMapping("departments/{id}")
public String deleteDepartment(@PathVariable int id) throws DepartmentException{
	departmentService.deleteDepartment(id);
	return "Department Deleted succefully";
	
}




}
