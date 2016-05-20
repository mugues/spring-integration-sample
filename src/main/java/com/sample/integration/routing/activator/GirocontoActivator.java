package com.sample.integration.routing.activator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sample.integration.routing.domain.GirocontoRequest;

/**
 * L'attivatore astratto per le modifiche al modello dati dipartimentale
 * 
 * @author Massimo Ugues
 *
 */
public class GirocontoActivator extends BankingServiceActivator<GirocontoRequest>{
	private final static Logger logger = LoggerFactory.getLogger(GirocontoActivator.class);

	@Override
	public GirocontoRequest activate(GirocontoRequest domain) {
		domain.setRapportoAccredito("RapportoAccreditoCambiato");
		logger.debug("Activating on giroconto... with domain {}", domain);
		return domain;
	}

}
