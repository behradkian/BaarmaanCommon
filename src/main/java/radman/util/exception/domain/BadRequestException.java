package radman.util.exception.domain;

import radman.util.rest.enumeration.HttpStatusCode;
import radman.util.exception.base.RadmanRuntimeException;

/**
 * @author : Pedram Behradkian
 * @date : 2025/11/02
 */
public class BadRequestException extends RadmanRuntimeException {
    public BadRequestException(String message) {
        super(HttpStatusCode.BAD_REQUEST, message);
    }


    public BadRequestException(String message, Throwable cause) {
        super(HttpStatusCode.BAD_REQUEST, message, cause);
    }
}
