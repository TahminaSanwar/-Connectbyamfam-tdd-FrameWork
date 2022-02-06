package reporting;

import java.util.logging.Logger;
import java.util.logging.Level;



public class Java_logger {
	public static final Logger logger=Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	public static void getLog(String msg) {
		logger.log(Level.INFO, msg);
	}
	

}
