package com.workintech.zoo.exceptions;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ZooGlobalExceptionHandler {

    @ExceptionHandler(ZooException.class)
    public ResponseEntity<ZooErrorResponse> handleException(ZooException exception) {
            ZooErrorResponse errorResponse = new ZooErrorResponse(
                    exception.getStatus().value(),  // ✅ First: int (status)
                    exception.getMessage(),  // ✅ Second: String (message)
                    System.currentTimeMillis()  // ✅ Third: long (timestamp)
            );

            return new ResponseEntity<>(errorResponse, exception.getStatus());
    }
}
