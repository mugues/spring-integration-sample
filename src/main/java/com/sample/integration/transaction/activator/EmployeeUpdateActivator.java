package com.sample.integration.transaction.activator;

import com.sample.repository.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.sample.entity.Employee;

public class EmployeeUpdateActivator {
	private final static Logger logger = LoggerFactory.getLogger(EmployeeUpdateActivator.class);

	@Autowired
	private EmployeeRepository employeeRepository;

	public Employee activate(Employee employee) {
		logger.debug("Updating employee {}", employee);
		
		employee.setState("UPDATED");

		employeeRepository.save(employee);

		return employee;
	}

}
