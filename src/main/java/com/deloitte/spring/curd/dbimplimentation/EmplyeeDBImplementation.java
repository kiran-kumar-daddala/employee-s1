package com.deloitte.spring.curd.dbimplimentation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deloitte.spring.curd.dbentities.EmployeeEntity;
import com.deloitte.spring.curd.repository.EmployeeRepositoryInterface;

@Service
public class EmplyeeDBImplementation {
	
	@Autowired
	EmployeeRepositoryInterface employeeRepositoryInterface;
	
	public boolean saveEmpDetails(EmployeeEntity inputEmpEntity) {
		
		
		boolean empDetailsSaved = false;
		
		EmployeeEntity saveEmpEntity = employeeRepositoryInterface.saveAndFlush(inputEmpEntity);
		if(null != saveEmpEntity) {
			empDetailsSaved = true;
		}
		
		return empDetailsSaved;
		
	}

	public List<EmployeeEntity> getAllEmployeeDetails() {
		// TODO Auto-generated method stub
		List<EmployeeEntity> empListFromDB = employeeRepositoryInterface.findAll();
		return empListFromDB;
	}

	public boolean updateEmpDetails(EmployeeEntity employeeObj) {
		// TODO Auto-generated method stub
		boolean empDetailsSaved = false;
		EmployeeEntity updateEmpEntity = employeeRepositoryInterface.saveAndFlush(employeeObj);
		if(null != updateEmpEntity) {
			empDetailsSaved = true;
		}
		return empDetailsSaved;
	}
	
	public void deleteEmpDetails(int  id) {
		
		employeeRepositoryInterface.deleteById(id);	
	}

	public List<EmployeeEntity> getEmpByEmail(String emailid) {
		
		return employeeRepositoryInterface.findByEmpEmail(emailid);
	
	}	
}
