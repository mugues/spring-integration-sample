/**
 *	30/dic/2010
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
package com.sample.integration.routing.domain;

/**
 * @author Massimo Ugues
 * 
 */
public enum MessageState {
			PRELOADING(10), PROCESSING(20), COMPLETED(30);

	private final int stateCode;

	MessageState(int state) {
		this.stateCode = state;
	}

	public int getState() {
		return stateCode;
	}

	public static MessageState decode(int stateCode) {
		for (MessageState value : MessageState.values()) {
			if (value.stateCode == stateCode) {
				return value;
			}
		}
		return null;
	}
}
