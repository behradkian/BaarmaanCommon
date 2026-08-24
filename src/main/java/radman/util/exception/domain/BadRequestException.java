package radman.util.exception.domain;

import radman.util.general.enumeration.http.StatusCode;
import radman.util.exception.base.RadmanRuntimeException;

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
