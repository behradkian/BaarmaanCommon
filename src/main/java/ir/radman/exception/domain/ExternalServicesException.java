package ir.radman.exception.domain;

import ir.radman.exception.base.RadmanCheckedException;

/**
 * @author : Pedram Behradkian
 * @date : 2025/11/02
 */
public class ExternalServicesException extends RadmanCheckedException {
    public ExternalServicesException(String message) {
        super(message);
    }
}
