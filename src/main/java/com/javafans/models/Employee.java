package com.javafans.models;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection="Employee")
public class Employee {
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
