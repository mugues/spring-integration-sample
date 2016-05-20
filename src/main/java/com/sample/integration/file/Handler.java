/*
 * Copyright 2002-2010 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.sample.integration.file;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A class providing several handling methods for different types of payloads.
 * 
 * @author Mark Fisher
 * @author Marius Bogoevici
 */
public class Handler {
	private final static Logger logger = LoggerFactory.getLogger(Handler.class);
	
	
	public String handleString(String input) {
		
		logger.debug("Copying text: " + input);
		return input.toUpperCase();
	}
	
	/*
	public File handleFile(File input) {
		logger.debug("Copying file: " + input.getAbsolutePath());
		return input;
	}
	*/
	
}
