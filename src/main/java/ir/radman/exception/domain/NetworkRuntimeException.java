package ir.radman.exception.domain;

import ir.radman.exception.base.RadmanRuntimeException;

public class NetworkRuntimeException extends RadmanRuntimeException {

    public NetworkRuntimeException(String message) {
        super(message);
    }

    public NetworkRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }

}
