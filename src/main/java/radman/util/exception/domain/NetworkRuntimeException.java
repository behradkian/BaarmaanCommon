package radman.util.exception.domain;

import radman.util.exception.base.RadmanRuntimeException;

public class NetworkRuntimeException extends RadmanRuntimeException {

    public NetworkRuntimeException(String message) {
        super(message);
    }

    public NetworkRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }

}
