package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4j2Demo {
	
	private static Logger logger = LogManager.getLogger(Log4j2Demo.class);

	public static void main(String[] args) {
		
		logger.info("testing log4j");
		logger.warn("this is a warning message");
		logger.fatal("this is fatal message");
		

	}

}
