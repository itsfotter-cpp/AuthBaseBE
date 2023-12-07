package com.authbase.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.CONFLICT)
public class ResourceConflictException extends RuntimeException{

    public ResourceConflictException() { }

    public ResourceConflictException(String resourceName, String fieldName) {
        super(String.format("That %s already exist in table %s", fieldName, resourceName));
    }

    public ResourceConflictException(String message) { super(message);}

}
