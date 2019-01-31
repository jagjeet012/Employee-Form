package org.jagjeet.emp.dao;

import javax.persistence.EntityManager;

import org.jagjeet.emp.model.Address;
import org.jagjeet.emp.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmpDaoImpl implements EmpDao {

	@Autowired
	org.hibernate.SessionFactory sessionFactory;

	private EntityManager getEntityManager() {
		return sessionFactory.getCurrentSession().getEntityManagerFactory().createEntityManager();
	}

	@Override
	public int addDetails(Employee employee) {
		return (int) sessionFactory.getCurrentSession().save(employee);
	}

	@Override
	public Employee getDetails(Integer employeeId) {
		return sessionFactory.getCurrentSession().get(Employee.class, employeeId);
	}

	@Override
	public int addAddress(Address address) {
		return (int) sessionFactory.getCurrentSession().save(address);
	}

}
