package com.sample.integration.routing;

import com.sample.integration.routing.domain.GirocontoRequest;
import com.sample.integration.routing.domain.Message;
import com.sample.integration.routing.gateway.Gateway;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class RoutingApplication {
	private final static Logger logger = LoggerFactory.getLogger(RoutingApplication.class);

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context/routing-service-context.xml");

		Gateway gateway = (Gateway) context.getBean("gateway");
		
		//Response response = gateway.send(new Message<GirocontoRequest>());
		//logger.debug("Response di tipo {}", response);
		
		
		GirocontoRequest girocontoRequest = new GirocontoRequest("RapportoAddebito", "RapportoAccredito", 100.00);
		Message<GirocontoRequest> giroconto = new Message<>(girocontoRequest);
		
		logger.debug("Seding message service giroconto...");
		girocontoRequest = gateway.send(giroconto);
		logger.debug("Response di tipo {}", girocontoRequest);
		
		
		/*
		BonificoRequest bonificoRequest = new BonificoRequest("RapportoAddebito", "RapportoAccredito", 50.00);
		Message<BonificoRequest> bonifico = new Message<BonificoRequest>(bonificoRequest);
		
		logger.debug("Seding message service bonifico...");
		gateway.send(bonifico);
		*/
		
	}
}
