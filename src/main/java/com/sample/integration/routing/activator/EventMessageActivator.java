package com.sample.integration.routing.activator;

import java.io.Serializable;


public interface EventMessageActivator<T extends Serializable> {

	T activate(T domain);
}
