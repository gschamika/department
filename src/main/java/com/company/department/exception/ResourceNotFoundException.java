package com.company.department.exception;

/**
 * @author : gschamika
 */
public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException(String message) {
        super(message);
    }
}
