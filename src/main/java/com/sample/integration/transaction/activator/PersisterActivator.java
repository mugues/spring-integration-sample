package com.sample.integration.transaction.activator;

import com.sample.repository.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sample.entity.Employee;

public class PersisterActivator {
	private final static Logger logger = LoggerFactory.getLogger(PersisterActivator.class);

	@Autowired
	private EmployeeRepository employeeRepository;

	@Transactional(propagation = Propagation.REQUIRED)
	public Employee activate(Employee employee) {
		logger.debug("Persisting employee {}", employee);

		employeeRepository.save(employee);
		
		return employee;
	}

}
