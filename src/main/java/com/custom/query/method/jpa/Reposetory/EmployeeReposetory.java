package com.custom.query.method.jpa.Reposetory;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.custom.query.method.jpa.entities.Employee;

@Repository
public interface EmployeeReposetory extends CrudRepository<Employee, Integer> {
	
//	@Query("select empName from Employee") 
//	@Query( value = "Select emp_name from employee_details" , nativeQuery = true) // SQL native queries 
//	public List<String> findAllEmployeeName();
	
//	@Query("select gender from Employee where empId=123")
//	@Query("select gender from Employee where empId=:eId")
//	public String findOneEmpoyeeName(int eId);
	
//	public List<Employee> findByEmpAgeBetween(double sAge , double eAge);
	
//	@Query("select empName , empAddress from Employee where gender=:gen and empAge=:eAge ")
//	public String findEmployeeByMultipleColumn(String gen, double eAge);
	
	public List<Employee> findByGenderAndEmpAgeBetween(String gen , double sAge , double eAge);
	
	

}
