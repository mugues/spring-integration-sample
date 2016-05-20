package com.sample.integration.common.error;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessagingException;

import com.sample.integration.routing.domain.Response;

/**
 * @author Massimo Ugues
 * 
 */
public class ErrorHandlerActivator {
	private final static Logger logger = LoggerFactory.getLogger(ErrorHandlerActivator.class);

	public Response activate(Message<?> message) {
		logger.debug("Calling error handler activator");
		Response response = null;
		if (message.getPayload() instanceof MessagingException) {
			MessagingException messageException = (MessagingException) message.getPayload();

			handleException(messageException);

			response = new Response(messageException.toString());
		}
		
		logger.error("Exception {}", message);
		return response;
	}

	private void handleException(MessagingException messageException) {
		Message<?> failedMessage = messageException.getFailedMessage();
		
		logger.warn("Failed message {} for exception {}", failedMessage, messageException);
		
		throw messageException;

	}

}
