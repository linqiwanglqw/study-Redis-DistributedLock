package com.lin.service;

import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DistributedLockService {
    @Autowired
    private RedissonClient redissonClient;

    /**
     * 基于Redisson实现分布式锁
     */
    public void test() {
        RLock redisKey = redissonClient.getLock("redisKey");
        try {
            //上锁
            redisKey.lock(); //默认30秒
            Thread.sleep(100000000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            //释放锁
            redisKey.unlock();
        }
    }
}
