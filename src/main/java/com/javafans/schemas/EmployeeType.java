package com.javafans.schemas;

import java.io.Serializable;
import java.util.List;

import com.javafans.models.Address;
import com.javafans.models.Department;
import com.javafans.models.ReportingToDetails;

import lombok.Data;


@Data
public class EmployeeType implements Serializable {
	
	private String empId;
	
	private String name;
	
	private String designation;
	
	private String personalEmail;
	
	private String officialEmail;
	
	private String  dateOfBirth;
	
	private List<Address> addressList;
	
	private Department department;
	
	private ReportingToDetails reportingToDetails;
}
