package com.sample.integration.routing.activator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sample.integration.routing.domain.Message;

/**
 * @author Massimo Ugues
 * 
 */
public class ValidationErrorActivator {
	private final static Logger logger = LoggerFactory.getLogger(ValidationErrorActivator.class);
	
	
	public Message<?> activate(Message<?> message) {
		logger.debug("Validating content on message {}", message);
		
		//Assert.assertNotNull(message.getPayload(), "Payload null, unable to proceed....");
		
		return message;
	}
	
}
