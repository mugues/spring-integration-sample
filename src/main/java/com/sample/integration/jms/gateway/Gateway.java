package com.sample.integration.jms.gateway;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sample.entity.Employee;

@Transactional(propagation = Propagation.REQUIRES_NEW)
public interface Gateway {
    void send(String string);
 
}

