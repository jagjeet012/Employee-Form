package org.jagjeet.emp.dao;

import org.jagjeet.emp.model.Address;
import org.jagjeet.emp.model.Employee;

public interface EmpDao {

	public int addDetails(Employee employee);

	public Employee getDetails(Integer employeeId);

	public int addAddress(Address address);

}
