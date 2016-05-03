/**
 *	02/feb/2011
 *
 * Copyright (c) 2010 Alten Italia, All Rights Reserved.
 *
 * This software is the confidential and proprietary information of
 * Alten Italia ("Confidential Information").
 * You shall not disclose such Confidential Information and shall use it
 * only in accordance with the terms of the license agreement you entered 
 * into with Alten Italia.
 *
 * Alten Italia - MAKES NO REPRESENTATIONS OR WARRANTIES ABOUT THE SUITABILITY 
 * OF THE SOFTWARE, EITHER EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO 
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, 
 * OR NON-INFRINGEMENT. ALTEN ITALIA SHALL NOT BE LIABLE FOR ANY DAMAGES SUFFERED
 * BY LICENSEE AS A RESULT OF USING, MODIFYING OR DISTRIBUTING THIS SOFTWARE OR 
 * ITS DERIVATIVES.
 */
package com.sample.integration.routing.activator;

import java.io.Serializable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sample.integration.routing.domain.Message;
import com.sample.integration.routing.domain.MessageState;

/**
 * L'attivatore astratto per le modifiche al modello dati dipartimentale
 * 
 * @author Massimo Ugues
 *
 */
public abstract class BankingServiceActivator<T extends Serializable> implements EventMessageActivator<T>{
	private final static Logger logger = LoggerFactory.getLogger(BankingServiceActivator.class);

	
	protected void updateEventMessage(Message<T> message) {
		message.setMessageState(MessageState.PROCESSING);
		logger.debug("Modifica event state in corso: impostato a   {}", MessageState.PROCESSING);
		
	}
	
	public abstract T activate(T domain);
	

}
