package ir.radman.exception.redisson;

public class RedissonAcquireLockException extends RedissonException{
    public RedissonAcquireLockException(String message) {
        super(message);
    }

}
