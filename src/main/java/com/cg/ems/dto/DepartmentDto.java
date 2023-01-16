package com.cg.ems.dto;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
@Entity
@Table(name="dept_table")
public class DepartmentDto {
@Id
int departId;
@Column(name="d_name")
String departName;

@OneToOne(mappedBy = "department",cascade=CascadeType.ALL)
@JoinColumn(name="emp_id")
EmployeeDto employee;

@OneToOne(mappedBy = "department",cascade=CascadeType.ALL)
@JoinColumn(name="comp_id")
ComplianceDto compliance;

@OneToOne(mappedBy = "department",cascade=CascadeType.ALL)
@JoinColumn(name="sts_id")
StatusReportDto statusreport;

public DepartmentDto() {
	super();
}

public DepartmentDto(int departId, String departName) {
	super();
	this.departId = departId;
	this.departName = departName;
}

public int getDepartId() {
	return departId;
}
public void setDepartId(int departId) {
	this.departId = departId;
}
public String getDepartName() {
	return departName;
}
public void setDepartName(String departName) {
	this.departName = departName;
}
@Override
public String toString() {
	return "Department [departId=" + departId + ", departName=" + departName + "]";
}
}
