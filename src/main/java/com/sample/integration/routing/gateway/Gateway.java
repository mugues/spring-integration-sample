package com.sample.integration.routing.gateway;

import com.sample.integration.routing.domain.GirocontoRequest;
import com.sample.integration.routing.domain.Message;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;



public interface Gateway {
	 
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	GirocontoRequest send(Message<?> message);
 
}

