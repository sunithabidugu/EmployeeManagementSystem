package com.cg.ems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.ems.repository.IComplianceRepository;
import com.cg.ems.dto.ComplianceDto;
import com.cg.ems.dto.DepartmentDto;
import com.cg.ems.dto.StatusReportDto;
import com.cg.ems.exception.ComplianceIdExistsException;
import com.cg.ems.exception.RlNotExistsException;
import com.cg.ems.exception.RlNotExistsWithIdException;
import com.cg.ems.service.IComplianceServiceImpl;

@RestController
@RequestMapping("/ems")
public class ComplianceController {
	@Autowired
	IComplianceServiceImpl cService;
	
	
	@PostMapping("/create/rl")
	public void createRl(@RequestBody ComplianceDto cdto ) throws ComplianceIdExistsException {
		this.cService.createRl(cdto);
		
		
	}
	@GetMapping("/getall/rl")
	public List<ComplianceDto> getAllRl() throws RlNotExistsException {
		// TODO Auto-generated method stub
		return cService.getAllRl();
		
	}
	@GetMapping("/getall/rl/{userId}")
	public List<ComplianceDto> getAllRl(@PathVariable("userId") String userId) throws RlNotExistsWithIdException {
		// TODO Auto-generated method stub
		List<ComplianceDto> cd = cService.getAllRl(userId);
		
		return cd;
		
	
	}
	
}
