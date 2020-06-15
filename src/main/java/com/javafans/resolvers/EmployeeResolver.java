package com.javafans.resolvers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.javafans.graphQl.query.GetEmployeeInputQuery;
import com.javafans.schemas.GetEmployeeOutput;
import com.javafans.service.EmployeeServiceImpl;

/**
 * 
 * @author shruti.i
 *
 */
@Component
public class EmployeeResolver implements GraphQLQueryResolver{
	
	@Autowired
	EmployeeServiceImpl employeeServiceImpl;
	
	public GetEmployeeOutput getEmployeeDetails(GetEmployeeInputQuery getEmployeeInputQuery) {
		return employeeServiceImpl.getEmployeeDetails(getEmployeeInputQuery);
	}
		
}
