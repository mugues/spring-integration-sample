package com.sample.integration.transaction.gateway;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sample.entity.Employee;


public interface Gateway {
	 
	@Transactional(propagation = Propagation.REQUIRES_NEW)
    void send(Employee employee);
 
}

