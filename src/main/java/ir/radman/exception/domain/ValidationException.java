package ir.radman.exception.domain;

import ir.radman.exception.base.RadmanRuntimeException;

public class ValidationException extends RadmanRuntimeException {
    public ValidationException(String message) {
        super(message);
    }

    public ValidationException(String message, Throwable cause) {
        super(message, cause);
    }

}
