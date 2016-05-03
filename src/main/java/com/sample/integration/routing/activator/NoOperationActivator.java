/**
 *	29/dic/2010
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
import org.springframework.stereotype.Service;

@Service
public class NoOperationActivator  {
	private final static Logger logger = LoggerFactory.getLogger(NoOperationActivator.class);


	public <T extends Serializable> void activate(T domain) {
		logger.info("no operation activator .... {}", domain);

	}

}
