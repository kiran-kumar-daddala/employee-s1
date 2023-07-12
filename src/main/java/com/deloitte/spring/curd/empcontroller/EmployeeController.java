package com.deloitte.spring.curd.empcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deloitte.spring.curd.dbentities.EmployeeEntity;
import com.deloitte.spring.curd.service.EmployeeService;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	
	@PostMapping("/saveemp")
	public boolean saveEmployeeDetails(@RequestBody EmployeeEntity inputEmpEntyObj) {
		boolean empSaved = false;
		try{
			empSaved = employeeService.saveEmpDetails(inputEmpEntyObj);
		}catch (Exception ex) {
			ex.printStackTrace();
		}
				
		return empSaved;
		
	}
	
	@GetMapping("/empdetails")
	public List<EmployeeEntity> getEmployeeDetails(){
		List<EmployeeEntity> empEntityList = null;
		try{
			empEntityList = employeeService.getAllEmployeeFromDB();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return empEntityList;
	}
	
	@PutMapping("/update")
	public boolean update(@RequestBody EmployeeEntity employeeObj) {
		return employeeService.save(employeeObj);
	}
	
	@DeleteMapping("/employee/{id}")
	public  String delete(@PathVariable int id) {
		employeeService.deleteEmp(id);
		return "Item deleted Successfully";
	}
	
	@GetMapping("/empdt/{emailid}")
	public List<EmployeeEntity> getEmployeeDetails(@PathVariable(name="emailid") String emailid){
		
		return	employeeService.getEmpEmail(emailid);
		
	}
	
}
