package ir.radman.tool.redis.manager;

import ir.radman.exception.redisson.RedissonCheckLockException;
import ir.radman.exception.redisson.RedissonException;
import ir.radman.exception.redisson.RedissonNullLockObjectException;
import ir.radman.tool.redis.RedissonCacheInfo;
import ir.radman.tool.redis.RedissonCacheMap;
import ir.radman.tool.redis.RedissonLockInfo;
import org.redisson.api.RLock;
import org.redisson.api.RRateLimiter;

public interface RedissonOperation {

    Object add(RedissonCacheInfo redissonCacheInfo);

    Object addAndUpdate(RedissonCacheInfo redissonCacheInfo);

    Object get(RedissonCacheInfo redissonCacheInfo);

    Object remove(RedissonCacheInfo redissonCacheInfo);

    RRateLimiter getRateLimiter(String rateLimiterName);

    boolean addAndUpdateAll(RedissonCacheMap redissonCacheMap) ;

    RLock lock(RedissonLockInfo lockInfo) throws RedissonException, RedissonCheckLockException;

    boolean unlock(RLock lock) throws RedissonException, RedissonNullLockObjectException;

}
