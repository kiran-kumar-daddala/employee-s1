package com.deloitte.spring.curd.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deloitte.spring.curd.dbentities.EmployeeEntity;

@Repository
public interface EmployeeRepositoryInterface extends JpaRepository<EmployeeEntity, Integer>{

	List<EmployeeEntity> findByEmpEmail(String emailid);

}
