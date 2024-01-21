package _1_learn._1_3_handling._1_3_1_exception_handling._1_3_1_3_logging;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerExample {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(LoggerExample.class.getName());
        logger.severe("1 - severe - This is a severe message");
        logger.warning("2 - warning - This is a warning message");
        logger.info("3 - info - This is an informational message");
        logger.config("4 - config - This is a configuration message");
        logger.fine("5 - fine - This is a fine message");
        logger.finer("6 - finer - This is a finer message");
        logger.finest("7 - finest - This is the finest message");

        logger.setLevel(Level.INFO);
    }
}