package radman.util.exception.domain;

import radman.util.rest.enumeration.HttpStatusCode;
import radman.util.exception.base.RadmanRuntimeException;

/**
 * @author : Pedram Behradkian
 * @date : 2025/11/07
 */
public class ConvertException extends RadmanRuntimeException {
    public ConvertException(String message) {
        super(HttpStatusCode.BAD_REQUEST, message);
    }

    public ConvertException(String message, Throwable cause) {
        super(HttpStatusCode.BAD_REQUEST, message, cause);
    }
}
