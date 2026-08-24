package radman.util.exception.domain;

import radman.util.exception.base.RadmanCheckedException;

/**
 * @author : Pedram Behradkian
 * @date : 2025/11/02
 */
public class DatabaseConnectionException extends RadmanCheckedException {
    public DatabaseConnectionException(String message) {
        super(message);
    }
}
