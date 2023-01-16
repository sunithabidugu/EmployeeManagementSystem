package com.cg.ems.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.ems.repository.IStatusReportRepository;
import com.cg.ems.dto.ComplianceDto;
import com.cg.ems.dto.StatusReportDto;
import com.cg.ems.exception.ComplianceIdExistsException;
import com.cg.ems.exception.ReportNotExistsException;
import com.cg.ems.exception.RlNotExistsException;
import com.cg.ems.exception.StatusIdExistsException;
@Service 
public class IStatusReportServiceImpl implements IStatusReportService{
	@Autowired
	IStatusReportRepository sRepository;
	@Override
	
	/* @author : LavanyaKunda
	 * @return : It doesn't return anything as return type is void but it saves the created status report in the repository
	 * @description : This method Creates Status Reports and saves it in the Repository
	 */
	public void createStatusReport(StatusReportDto statusreport) throws StatusIdExistsException {
		
		Optional<StatusReportDto> cd = sRepository.findById(statusreport.getStatusId());
		if(cd.isPresent()) {
			throw new StatusIdExistsException("statusId exists in the table");
		}
		sRepository.save(statusreport);
		
	}
	/* @author : LavanyaKunda
	 * @return : List Of Status Reports that matches with the given user id and compliance Id
	 * @description : This method returns the  List of Status Reports with the given userId and Compliance Id 
	 */

	@Override
	public List<StatusReportDto> getAllStatusReport(String userId, int complianceId) throws ReportNotExistsException{
		Optional<List<StatusReportDto>> cd = Optional.of(sRepository.getAllStatusReport(userId, complianceId));
		if(sRepository.findAll().isEmpty()) {
			throw new ReportNotExistsException("No status Reports");
		}
		return sRepository.getAllStatusReport(userId, complianceId);
	}

}
