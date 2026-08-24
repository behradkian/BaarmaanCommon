package ir.radman.exception.domain;

import ir.radman.general.enumeration.http.StatusCode;
import ir.radman.exception.base.RadmanRuntimeException;

public class RestCallException extends RadmanRuntimeException {

    public RestCallException(StatusCode status, String message) {
        super(status, message);
    }

    public RestCallException(StatusCode status, String message, Throwable cause) {
        super(status, message, cause);
    }
}
