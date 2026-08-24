package radman.util.redis.exception;

public abstract class RedissonException extends Exception {
    public RedissonException(String message) {
        super(message);
    }

    public RedissonException(Throwable throwable) {
        super(throwable);
    }

    public RedissonException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
