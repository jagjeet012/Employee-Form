package org.jagjeet.emp.service;

import org.jagjeet.emp.model.Address;
import org.jagjeet.emp.model.Employee;

public interface EmpService {

	// Employee

	public int addDetails(Employee employee);

	public Employee getDetails(Integer employeeId);
	
	public int addAddress(Address address);
}