package com.cg.ems.service;

import java.util.List;

import com.cg.ems.dto.StatusReportDto;
import com.cg.ems.exception.ReportNotExistsException;
import com.cg.ems.exception.StatusIdExistsException;

public interface IStatusReportService {
	public void createStatusReport(StatusReportDto statusreport) throws StatusIdExistsException;
	public List<StatusReportDto> getAllStatusReport(String userId,int complianceId) throws ReportNotExistsException;
}
