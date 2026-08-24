package radman.util.exception.domain;

import radman.util.general.enumeration.http.StatusCode;
import radman.util.exception.base.RadmanRuntimeException;

/**
 * @author : Pedram Behradkian
 * @date : 2025/11/07
 */
public class ConvertException extends RadmanRuntimeException {
    public ConvertException(String message) {
        super(StatusCode.BAD_REQUEST, message);
    }

    public ConvertException(String message, Throwable cause) {
        super(StatusCode.BAD_REQUEST, message, cause);
    }
}
