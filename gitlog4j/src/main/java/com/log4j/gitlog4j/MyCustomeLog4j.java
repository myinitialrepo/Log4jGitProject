package com.log4j.gitlog4j;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class MyCustomeLog4j {

	final static Logger LOGGER = Logger.getLogger(MyCustomeLog4j.class);
	

	private void runMe(String parameter) {

		if(LOGGER.isDebugEnabled()) {
			LOGGER.debug(parameter);
		}

		if(LOGGER.isInfoEnabled()) {
			LOGGER.info(parameter);
		}
		if(LOGGER.isTraceEnabled()) {
			LOGGER.trace(parameter);
		}

		LOGGER.warn("This  is warn :" + parameter);
		LOGGER.error("This  is error :" + parameter);
		LOGGER.fatal("This  is fatal :" + parameter);	
	}

	public static void main(String[] args) {
		BasicConfigurator.configure();
		MyCustomeLog4j log= new MyCustomeLog4j();
		log.runMe("log4j");
		

	}

}
