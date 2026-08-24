package ir.radman.exception.redisson;

public class RedissonNullLockObjectException extends RedissonException{
    public RedissonNullLockObjectException(String message){
        super(message);
    }
}