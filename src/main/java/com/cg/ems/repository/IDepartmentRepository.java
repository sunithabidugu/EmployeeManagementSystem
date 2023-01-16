package com.cg.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.cg.ems.dto.DepartmentDto;

public interface IDepartmentRepository extends JpaRepository<DepartmentDto, Integer>{ 

}
