package com.deloitte.spring.curd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deloitte.spring.curd.dbentities.EmployeeEntity;
import com.deloitte.spring.curd.dbimplimentation.EmplyeeDBImplementation;

@Service
public class EmployeeService {

	@Autowired
	EmplyeeDBImplementation emplyeeDBImplementation;
	
	public boolean saveEmpDetails(EmployeeEntity empEntity) {
		
		boolean empSaved = false;
		 empSaved = emplyeeDBImplementation.saveEmpDetails(empEntity);
		return empSaved;
		
	}

	public List<EmployeeEntity> getAllEmployeeFromDB() {
		// TODO Auto-generated method stub
		return emplyeeDBImplementation.getAllEmployeeDetails();
	}

	public boolean save(EmployeeEntity employeeObj) {
		// TODO Auto-generated method stub
		boolean empUpdate = false;
		empUpdate = emplyeeDBImplementation.updateEmpDetails(employeeObj);
		return empUpdate;
	}

	public void deleteEmp(int id) {
		emplyeeDBImplementation.deleteEmpDetails(id);
	}

	public List<EmployeeEntity> getEmpEmail(String emailid) {
		// TODO Auto-generated method stub
		
		return emplyeeDBImplementation.getEmpByEmail(emailid);
	}

}
