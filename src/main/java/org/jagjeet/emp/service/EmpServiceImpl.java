package org.jagjeet.emp.service;

import org.jagjeet.emp.dao.EmpDao;
import org.jagjeet.emp.model.Address;
import org.jagjeet.emp.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmpServiceImpl implements EmpService {

	@Autowired
	EmpDao empDao;

	@Override
	@Transactional  // Here I'm showing the transanctional management through spring.
	public int addDetails(Employee employee) {
		return empDao.addDetails(employee);
	}

	@Override
	@Transactional
	public Employee getDetails(Integer employeeId) {
		return empDao.getDetails(employeeId);
	}

	@Override
	@Transactional
	public int addAddress(Address address) {
		return empDao.addAddress(address);
	}

}
