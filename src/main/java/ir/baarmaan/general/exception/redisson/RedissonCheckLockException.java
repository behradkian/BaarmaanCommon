package ir.baarmaan.general.exception.redisson;

public class RedissonCheckLockException extends RedissonException{

    public RedissonCheckLockException(String message){
        super(message);
    }
}
