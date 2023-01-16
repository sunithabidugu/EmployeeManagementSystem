package com.cg.ems.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import com.cg.ems.dto.EmployeeDto;
import com.cg.ems.exception.EmployeeException;
import com.cg.ems.repository.EmployeeRepository;


@Service
public class IEmployeeServiceImpl {
	@Autowired 
	EmployeeRepository repo;
	
	/*@author:Sunitha
	  @return:AllEmployeeDetails
    @description:This method getAllEmployee to the repository and returns AllEmployeeDetails
  */
	
	public List<EmployeeDto>getAllEmployees(){
		List<EmployeeDto> emp=repo.findAll();
		return emp;
	}
	/*@author:Sunitha
	  @return:Employee
      @description:This method adds Employee to the repository and returns Employee
    */
	public EmployeeDto addEmployee( EmployeeDto emp) {
		return repo.save(emp);
		
	}
	/*@author:Sunitha
	  @return:EmployeeById
    @description:This method getEmployeeById if exists retuns EmployeeById otherwise throws exception
  */
	public EmployeeDto getEmployeeById(int id) throws EmployeeException {
		if(repo.existsById(id)) {
			return repo.findById(id).get();
		}
		else {
			throw new EmployeeException("Employee not found");
		}
	}
	/*@author:Sunitha
	  @return:updatedEmployeeDetails
    @description:This method updateEmployee to the repository and returns UpdatedEmployeeDetails
  */	
	public EmployeeDto updateEmployee( EmployeeDto emp) {
		repo.save(emp);
		return emp;
	}
	/*@author:Sunitha
    @description:This method delete Employee to the repository.
  */
	public void deleteEmployee(int id) {
		this.repo.deleteById(id);
			
	}
	/*@author:Sunitha
	  @return:EmployeeCount
    @description:This method getEmployeeCount to the repository and returns EmployeeCount
  */
	public int getEmployeeCount() {
		int EmpCount=0;
		EmpCount=(int)repo.count();
		return EmpCount;
		
	}
		

}
