package radman.util.exception.domain;

import radman.util.general.enumeration.http.StatusCode;
import radman.util.exception.base.RadmanRuntimeException;

public class InvalidTemperatureException extends RadmanRuntimeException {

    public InvalidTemperatureException(String message) {
        super(StatusCode.BAD_REQUEST,message);
    }

    public InvalidTemperatureException(String message, Throwable cause) {
        super(message, cause);
    }

}
