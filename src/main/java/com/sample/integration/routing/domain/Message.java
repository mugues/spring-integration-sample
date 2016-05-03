package com.sample.integration.routing.domain;

import java.io.Serializable;

/**
 * @author Massimo Ugues
 * 
 */
public class Message<T extends Serializable> {
	private T payload;
	private MessageState messageState = MessageState.PRELOADING;
	
	public Message(T payload) {
		this.payload = payload;
	}

	public Message() {
	}

	public T getPayload() {
		return payload;
	}

	public void setPayload(T payload) {
		this.payload = payload;
	}

	
	public MessageState getMessageState() {
		return messageState;
	}

	public void setMessageState(MessageState messageState) {
		this.messageState = messageState;
	}

	@Override
	public String toString() {
		return "Message [payload=" + payload + " messageState="+messageState+"] ";
	}
	
}
