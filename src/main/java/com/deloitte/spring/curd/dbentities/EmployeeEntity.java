package com.deloitte.spring.curd.dbentities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="Employeedetails")
public class EmployeeEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "emp_id")
	private int empId;
	
	@Column(name = "emp_name")
	private String empName;
	
	@Column(name = "emp_email")
	private String empEmail;
	
	@Column(name = "emp_roll")
	private String empRoll;
	
	@Column(name = "emp_address")
	private String empAddress;

}
