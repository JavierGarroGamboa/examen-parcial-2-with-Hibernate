package cr.exception;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Manage the exceptions of the backend for DAO
 */
public class DAOException extends Exception {
    private static final Logger logger = LogManager.getLogger(DAOException.class);

    public DAOException(String message) {
        super(message);
        logger.error("Error importante - Capa DAO");
    }

    public DAOException(String message, Throwable cause) {
        super(message, cause);
        logger.error("Error importante - Capa DAO", cause);
    }
}
