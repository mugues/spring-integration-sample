package com.sample.integration.routing.transformer;

import java.io.Serializable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sample.integration.routing.domain.Message;

public class PayloadExtractor {
	private final static Logger logger = LoggerFactory.getLogger(PayloadExtractor.class);
	
	@SuppressWarnings("unchecked")
	public <T extends Serializable> T transform(Message<?> message) {
		logger.debug("Extracting payload...");
		return (T) message.getPayload();
	}

}
