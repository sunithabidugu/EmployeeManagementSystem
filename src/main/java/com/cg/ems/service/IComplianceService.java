package com.cg.ems.service;

import java.util.List;

import com.cg.ems.dto.ComplianceDto;
import com.cg.ems.dto.StatusReportDto;
import com.cg.ems.exception.ComplianceIdExistsException;
import com.cg.ems.exception.RlNotExistsException;
import com.cg.ems.exception.RlNotExistsWithIdException;

public interface IComplianceService {
	public void createRl(ComplianceDto co) throws ComplianceIdExistsException;
	public List<ComplianceDto> getAllRl() throws RlNotExistsException;
	public List<ComplianceDto> getAllRl(String userId)throws RlNotExistsWithIdException;
	
}
