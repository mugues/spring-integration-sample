package com.sample.integration.transaction.activator;

import com.sample.repository.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.sample.entity.Employee;

public class EmployeeLoader {
	private final static Logger logger = LoggerFactory.getLogger(EmployeeLoader.class);

	@Autowired
	private EmployeeRepository employeeRepository;

	public Employee transform(Long id)  {
		logger.debug("Loading object domain from id {}", id);
		
		Employee employee = employeeRepository.findOne(id);
		
		return employee;
	}

}
