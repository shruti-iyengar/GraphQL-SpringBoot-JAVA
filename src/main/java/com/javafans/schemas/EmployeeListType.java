package com.javafans.schemas;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.javafans.models.Employee;

import lombok.Data;

@Data
public class EmployeeListType implements Serializable {

protected List<Employee> employeeList;

public List<Employee> getEmployeeList(){
	if(employeeList== null) {
		employeeList=new ArrayList<Employee>();
	}
	return employeeList;
}

}
