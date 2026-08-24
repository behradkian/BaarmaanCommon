package radman.util.exception.domain;

import radman.util.general.enumeration.http.StatusCode;
import radman.util.exception.base.RadmanRuntimeException;

public class RestCallException extends RadmanRuntimeException {

    public RestCallException(StatusCode status, String message) {
        super(status, message);
    }

    public RestCallException(StatusCode status, String message, Throwable cause) {
        super(status, message, cause);
    }
}
