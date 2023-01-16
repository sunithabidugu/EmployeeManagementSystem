package com.cg.ems.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.ems.dto.DepartmentDto;
import com.cg.ems.exception.DepartmentException;

import com.cg.ems.repository.IDepartmentRepository;

@Service
public class IDepartmentServiceImpl implements IDepartmentService{
@Autowired
	private IDepartmentRepository departmentRepository;
public List<DepartmentDto> depts;	
@Override
public void addDeparment(DepartmentDto dname) throws DepartmentException {

	     Optional<DepartmentDto>   dept =  departmentRepository.findById(dname.getDepartId());
	     if(dept.isPresent())
	     {
	    	 throw new DepartmentException("Department Already Existed!!!");
	     }
		departmentRepository.save(dname);	
}

	@Override
	public List<DepartmentDto> getAllDepartment() {
		// TODO Auto-generated method stub
		 depts = (List<DepartmentDto>)departmentRepository.findAll(); 
		return depts;
	}


	@Override
	public int getAllDepartCount() {
		// TODO Auto-generated method stub
		int dcount=0;
	dcount=(int)departmentRepository.count();
	return dcount;
	}

	@Override
	public boolean deleteDepartment(int id) throws DepartmentException {
		// TODO Auto-generated method stub
		Optional<DepartmentDto> depart = departmentRepository.findById(id);
		if(depart.isPresent()) {
			departmentRepository.delete(depart.get());
			return true;
		}
		else {
			throw new DepartmentException("Sorry!!!!Department doesnot exist ");

		}
	}
		}

