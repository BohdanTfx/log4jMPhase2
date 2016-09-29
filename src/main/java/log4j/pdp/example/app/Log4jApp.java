package log4j.pdp.example.app;

import org.apache.log4j.Logger;

public class Log4jApp {

    private static final Logger LOG = Logger.getLogger(Log4jApp.class);

    public static void main(final String[] args) {

//        for (int i = 0; i < 1000000; i++) {
//            if (i < 1000) {
//                LOG.info("Test log message " + i);
//            } else if (i > 1000 && i < 2000){
//                LOG.info("Size of this message is more than 30 characters");
//            } else {
//                LOG.info("Incorrect content of message");
//            }
//        }
    	LOG.info("Info message");
    	LOG.warn("Warn message");
    	LOG.error("Error message");
    }
}
