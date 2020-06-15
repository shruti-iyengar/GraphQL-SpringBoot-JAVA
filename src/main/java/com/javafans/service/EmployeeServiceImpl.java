package com.javafans.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javafans.dao.EmployeeRepository;
import com.javafans.graphQl.query.GetEmployeeInputQuery;
import com.javafans.models.Employee;
import com.javafans.schemas.EmployeeListType;
import com.javafans.schemas.GetEmployeeOutput;

@Service
public class EmployeeServiceImpl {
	@Autowired 
	EmployeeRepository employeeRepository;
	
	public GetEmployeeOutput getEmployeeDetails(GetEmployeeInputQuery getEmployeeInputQuery) {
		List<String> empIds=Arrays.asList(getEmployeeInputQuery.getEmpId().split(","));
		List<Employee> employeeList=employeeRepository.findByEmpIdIn(empIds);
		GetEmployeeOutput employeeOutput=new GetEmployeeOutput();
		
		EmployeeListType employeeListType=new EmployeeListType();
		employeeListType.setEmployeeList(employeeList);
		employeeOutput.setEmployeeList(employeeListType);
		return employeeOutput;
	}

}
