package com.cg.ems.service;

import java.util.List;

import com.cg.ems.dto.DepartmentDto;
import com.cg.ems.exception.DepartmentException;


public interface IDepartmentService {

public List<DepartmentDto> getAllDepartment();

public int getAllDepartCount();
public boolean deleteDepartment(int id)throws DepartmentException;

public void addDeparment(DepartmentDto dname) throws DepartmentException;
}
