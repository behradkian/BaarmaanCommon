package ir.radman.exception.domain;

import ir.radman.exception.base.RadmanRuntimeException;

/**
 * Encryption exception class
 * 
 * @author : Pedram Behradkian
 * @date : 2025/11/07
 */
public class EncryptionException extends RadmanRuntimeException {
    public EncryptionException(String message) {
        super(message);
    }

    public EncryptionException(String message, Throwable cause) {
        super(message, cause);
    }
}