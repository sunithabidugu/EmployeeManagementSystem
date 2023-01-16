package com.cg.ems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.ems.dto.StatusReportDto;
import com.cg.ems.exception.ReportNotExistsException;
import com.cg.ems.exception.StatusIdExistsException;
import com.cg.ems.service.IComplianceServiceImpl;
import com.cg.ems.service.IStatusReportServiceImpl;

@RestController
@RequestMapping("/ems")
public class StatusReportController {
	@Autowired
	IStatusReportServiceImpl sService;
	
	@PostMapping("/create/statusreport")
	public void createStatusReport(@RequestBody StatusReportDto statusreport) throws StatusIdExistsException {
		this.sService.createStatusReport(statusreport);
	}
	@GetMapping("/getall/status/report/{userId}/{complianceId}")
	public List<StatusReportDto> getAllStatusReport(@PathVariable("userId") String userId,@PathVariable("complianceId") int complianceId) throws ReportNotExistsException {
		List<StatusReportDto> sd = sService.getAllStatusReport(userId, complianceId);
		return sd;
	}
}
