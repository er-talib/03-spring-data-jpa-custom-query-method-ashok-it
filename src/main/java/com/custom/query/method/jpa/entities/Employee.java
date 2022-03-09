package com.custom.query.method.jpa.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "employee_details")
public class Employee {
	
	@Id	
	private int empId ;
	private String empName ;
	private String empAddress ;
	private double empAge ;
	private String gender ;

}
