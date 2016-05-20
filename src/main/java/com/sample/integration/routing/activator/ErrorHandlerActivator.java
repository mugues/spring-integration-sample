package com.sample.integration.routing.activator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.MessagingException;

import com.sample.integration.routing.domain.Message;

/**
 * @author Massimo Ugues
 * 
 */
public class ErrorHandlerActivator {
	private final static Logger logger = LoggerFactory.getLogger(ErrorHandlerActivator.class);

	public void activate(Message<?> message) {
		logger.debug("Calling error handler activator");

		if (message.getPayload() instanceof MessagingException) {
			MessagingException messageException = (MessagingException) message.getPayload();

			handleException(messageException);

		}
		
		logger.error("Exception {}", message);
	}

	private void handleException(MessagingException messageException) {
		
		logger.warn("Failed message {} for exception {}",  messageException);
		
		throw messageException;

	}

}
