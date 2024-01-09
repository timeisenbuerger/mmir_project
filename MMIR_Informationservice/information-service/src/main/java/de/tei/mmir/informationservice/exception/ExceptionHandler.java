package de.tei.mmir.informationservice.exception;

import de.tei.mmir.gmaf.invoker.ApiException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

/**
 * Global exception handler for the application.
 * This class handles exceptions thrown by various parts of the application
 * and provides a centralized way of sending custom responses for these exceptions.
 */
@ControllerAdvice
public class ExceptionHandler {
    private static final Logger logger = LoggerFactory.getLogger(ExceptionHandler.class);

    /**
     * Handles exceptions specific to the GMAF API.
     * Logs the ApiException and sends a custom response to the client.
     *
     * @param ex The ApiException thrown during API operations.
     * @return A ResponseEntity object containing the error message and a HTTP status code.
     */
    @org.springframework.web.bind.annotation.ExceptionHandler(ApiException.class)
    public ResponseEntity<String> handleApiException(ApiException ex) {
        logger.error("API Exception: ", ex);

        String errorResponse = "Error occurred: " + ex.getMessage();
        return new ResponseEntity<>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    /**
     * Handles general exceptions that are not specifically caught by other handlers.
     * Logs the exception details and sends a custom response to the client.
     *
     * @param ex The Exception thrown during application operations.
     * @return A ResponseEntity object containing the error message and a HTTP status code.
     */
    @org.springframework.web.bind.annotation.ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleException(Exception ex) {
        logger.error("Exception: ", ex);

        String errorResponse = "An error occurred: " + ex.getMessage();
        return new ResponseEntity<>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
