package com.cg.ems.dto;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name="emp_table")
public class EmployeeDto {
	@Id
	@NotNull(message="userId cannot be null")
	Integer userId;
	@NotBlank(message="firstname cannot be empty")
	@Column(name="first_name")
	String firstName;
	@Column(name="last_name")
	@NotBlank(message="lastName cannot be empty")
	String lastName;
	@Column(name="dob")
	LocalDate dob;
	@Column(name="email")
	@Email(message="email should be valid")
	String email;
	
	@OneToOne(cascade=CascadeType.ALL)
	DepartmentDto department;
	
	
	
	public EmployeeDto() {
		super();
	}


	public EmployeeDto(int userId, String firstName, String lastName, LocalDate dob, String email, DepartmentDto department) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.email = email;
		this.department = department;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public LocalDate getDob() {
		return dob;
	}



	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public DepartmentDto getDepartment() {
		return department;
	}



	public void setDepartment(DepartmentDto department) {
		this.department = department;
	}


	@Override
	public String toString() {
		return "Employee [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob
				+ ", email=" + email + ", department=" + department + "]";
	}

	
}
