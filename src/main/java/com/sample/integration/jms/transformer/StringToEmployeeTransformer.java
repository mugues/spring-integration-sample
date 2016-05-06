package com.sample.integration.jms.transformer;

import java.io.Serializable;

import com.sample.entity.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sample.integration.routing.domain.Message;

public class StringToEmployeeTransformer {
	private final static Logger logger = LoggerFactory.getLogger(StringToEmployeeTransformer.class);
	
	public Employee transform(String employeeName) {
		logger.debug("Received name {} ", employeeName);

		return new Employee(employeeName);
	}

}
