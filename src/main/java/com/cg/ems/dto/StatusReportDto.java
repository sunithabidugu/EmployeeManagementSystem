package com.cg.ems.dto;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
@Entity
@Table(name="status_report")
public class StatusReportDto {
	@Id
	@Column(name="status_id")
	@NotNull(message="Status Id Cannot be Null")
	Integer statusId;
	@Column(name="comments")
	@NotBlank(message="Comments Cannot be Empty")
	String comments;
	@Column(name="details")
	@NotBlank(message="Details Cannot be Empty")
	String details;
	@Temporal(TemporalType.DATE)
	@Column(name="create_date")
	LocalDate createDate;
	@Column(name="user_id")
	@NotBlank(message="UserId cannot be Empty")
	String userId;
	@Column(name="compliance_id")
	@NotNull(message="Compliance Id cannot be Null")
	Integer complianceId;
	@OneToOne(cascade = CascadeType.ALL)
	DepartmentDto department;
	public StatusReportDto() {
		super();
	}
	public StatusReportDto(int statusId, String comments, String details, LocalDate createDate, String userId,
			int complianceId, DepartmentDto department) {
		super();
		this.statusId = statusId;
		this.comments = comments;
		this.details = details;
		this.createDate = createDate;
		this.userId = userId;
		this.complianceId = complianceId;
		this.department = department;
	}
	public int getStatusId() {
		return statusId;
	}
	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public LocalDate getCreateDate() {
		return createDate;
	}
	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public int getComplianceId() {
		return complianceId;
	}
	public void setComplianceId(int complianceId) {
		this.complianceId = complianceId;
	}
	public DepartmentDto getDepartment() {
		return department;
	}
	public void setDepartment(DepartmentDto department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "StatusReportDto [statusId=" + statusId + ", comments=" + comments + ", details=" + details
				+ ", createDate=" + createDate + ", userId=" + userId + ", complianceId=" + complianceId
				+ ", department=" + department + "]";
	}
	
	
	
	
	
	
	
	
	
}
