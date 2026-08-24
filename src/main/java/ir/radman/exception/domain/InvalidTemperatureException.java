package ir.radman.exception.domain;

import ir.radman.general.enumeration.http.StatusCode;
import ir.radman.exception.base.RadmanRuntimeException;

public class InvalidTemperatureException extends RadmanRuntimeException {

    public InvalidTemperatureException(String message) {
        super(StatusCode.HTTP_BAD_REQUEST,message);
    }

    public InvalidTemperatureException(String message, Throwable cause) {
        super(message, cause);
    }

}
