package com.standalone.jpa;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.standalone.jpa.Reposetory.EmployeeReposetory;
import com.standalone.jpa.entities.Employee;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		EmployeeReposetory bean = context.getBean(EmployeeReposetory.class);
		
	/*	Employee employee = new Employee();
		employee.setEmpId(129);
		employee.setEmpName("Zaid");
		employee.setEmpAddress("Punjab");
		employee.setEmpAge(22);
		employee.setGender("Male");
		
		bean.save(employee);
		*/
		
		/*
		
		List<String> allEmployeeName = bean.findAllEmployeeName();
		allEmployeeName.forEach(employees -> {
			System.out.println(employees);
		});
		*/
		
//		String employeeName = bean.findOneEmpoyeeName(128);
//		System.out.println(employeeName);		
//		System.out.println( bean.count());
		
		/*
		List<Employee> empAgeBetween = bean.findByEmpAgeBetween(23.5, 28);
		empAgeBetween.forEach(age ->{
			System.out.println(age);
		});
		*/
		
//		String multipleColumn = bean.findEmployeeByMultipleColumn("Male", 22);
//		System.out.println(multipleColumn);
//		
		
		List<Employee> finbByGenderAndEmpAgeBetween = bean.findByGenderAndEmpAgeBetween("Male", 22, 28);
		
		finbByGenderAndEmpAgeBetween.forEach(employee -> {
			System.out.println(employee);
		});
		
		context.close();
		
	}

}
