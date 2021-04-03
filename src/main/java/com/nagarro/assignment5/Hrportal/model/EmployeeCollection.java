package com.nagarro.assignment5.Hrportal.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
public class EmployeeCollection {
	
	private List<Employee> allemployee;
	
	

	public List<Employee> getAllemployee() {
		return allemployee;
	}



	public void setAllemployee(List<Employee> allemployee) {
		this.allemployee = allemployee;
	}



	public EmployeeCollection() {
		// TODO Auto-generated constructor stub
		
	}

}
