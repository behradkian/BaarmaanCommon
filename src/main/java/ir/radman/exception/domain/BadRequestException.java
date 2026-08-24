package ir.radman.exception.domain;

import ir.radman.general.enumeration.http.StatusCode;
import ir.radman.exception.base.RadmanRuntimeException;

/**
 * @author : Pedram Behradkian
 * @date : 2025/11/02
 */
public class BadRequestException extends RadmanRuntimeException {
    public BadRequestException(String message) {
        super(StatusCode.BAD_REQUEST, message);
    }


    public BadRequestException(String message, Throwable cause) {
        super(StatusCode.BAD_REQUEST, message, cause);
    }
}
