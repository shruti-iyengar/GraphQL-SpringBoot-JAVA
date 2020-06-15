package com.javafans.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.javafans.models.Employee;
/**
 * Repository interface which inherits all built in methods of MongoRepsoitory for find
 * @author shruti.i
 *
 */
@Repository
public interface EmployeeRepository extends MongoRepository<Employee, String>{
	
	List<Employee> findByEmpIdIn(List<String> empIds);

}
