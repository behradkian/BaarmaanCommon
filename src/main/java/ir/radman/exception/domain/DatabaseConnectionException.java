package ir.radman.exception.domain;

import ir.radman.exception.base.RadmanCheckedException;

/**
 * @author : Pedram Behradkian
 * @date : 2025/11/02
 */
public class DatabaseConnectionException extends RadmanCheckedException {
    public DatabaseConnectionException(String message) {
        super(message);
    }
}
