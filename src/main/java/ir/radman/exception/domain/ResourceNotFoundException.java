package ir.radman.exception.domain;

import ir.radman.exception.base.RadmanRuntimeException;

public class ResourceNotFoundException extends RadmanRuntimeException {

    public ResourceNotFoundException(String message) {
        super(message);
    }

    public ResourceNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

}
