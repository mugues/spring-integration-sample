package com.sample.integration.routing.activator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sample.integration.routing.domain.BonificoRequest;

public class BonificoActivator extends BankingServiceActivator<BonificoRequest>{
	private final static Logger logger = LoggerFactory.getLogger(BankingServiceActivator.class);


	@Override
	public BonificoRequest activate(BonificoRequest domain) {
		logger.debug("Activating on bonifico... with message {}", domain);
		return domain;
	}

}
