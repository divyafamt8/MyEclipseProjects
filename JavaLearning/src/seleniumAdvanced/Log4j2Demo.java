package seleniumAdvanced;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;


public class Log4j2Demo {
	
	private static Logger logger = LogManager.getLogger(Log4j2Demo.class);
	
	public static void main(String[] args) {
		
        logger.debug("This is a debug message");
        logger.info("This is an info message");
        logger.warn("This is a warn message");
        logger.error("This is an error message");
        logger.fatal("This is a fatal message");
    }
}
