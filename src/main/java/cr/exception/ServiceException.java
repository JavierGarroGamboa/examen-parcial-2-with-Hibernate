package cr.exception;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Manage the exceptions of the backend for Service
 */
public class ServiceException extends Exception {

    private static final Logger logger = LogManager.getLogger(ServiceException.class);

    public ServiceException(String message) {
        super(message);
        logger.error("Error importante - Capa Service");
    }

    public ServiceException(String message, Throwable cause) {
        super(message, cause);
        logger.error("Error importante - Capa Service", cause);
    }
}
