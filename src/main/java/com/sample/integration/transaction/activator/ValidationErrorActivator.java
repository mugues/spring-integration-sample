package com.sample.integration.transaction.activator;

import com.sample.integration.common.exception.ValidationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sample.entity.Employee;

/**
 * @author Massimo Ugues
 * 
 */
public class ValidationErrorActivator {
	private final static Logger logger = LoggerFactory.getLogger(ValidationErrorActivator.class);
	
	
	public String activate(Employee employee) {
		logger.debug("Employee name {}", employee.getName());

		if (!"Frank".equals(employee.getName())) {
			throw new ValidationException("Name not correct , throw assertion error "+ employee.getName());
		}

		return employee.getName();
	}

}
