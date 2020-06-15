package com.javafans.common;
/**
 * Common Utility Class
 * @author shruti.i
 *
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.javafans.graphQl.query.GetEmployeeInputQuery;
import com.javafans.models.Employee;
import com.javafans.schemas.EmployeeListType;
import com.javafans.schemas.GetEmployeeInput;

public class CommonUtils {

	
	public GetEmployeeInput getEmployeeInput(GetEmployeeInputQuery getEmployeeInputQuery) {
		
		GetEmployeeInput getEmployeeInput=new GetEmployeeInput();
		EmployeeListType employeeListType=new EmployeeListType();
		List<String> empIds=Arrays.asList(getEmployeeInputQuery.getEmpId().split(","));

		List<Employee> employeeList=new ArrayList<Employee>(empIds.size());
		for (String empId: empIds) {
			Employee employeeType=new Employee();
			employeeType.setEmpId(empId);
			employeeList.add(employeeType);
		}
		employeeListType.setEmployeeList(employeeList);
		getEmployeeInput.setEmployeeListType(employeeListType);
		return getEmployeeInput;
	
	}
}
