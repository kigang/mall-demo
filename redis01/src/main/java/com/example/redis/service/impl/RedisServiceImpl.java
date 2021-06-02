package com.example.redis.service.impl;

import com.example.redis.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;


/**
 *
 * @author qigang.qin@hand-china.com 2021/6/1 10:16
 */
@Service
public class RedisServiceImpl implements RedisService {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Override
    public void set(String key, String value) {
        stringRedisTemplate.opsForValue().set(key, value);
    }

    @Override
    public String get(String key) {
        return stringRedisTemplate.opsForValue().get(key);
    }

    @Override
    public boolean expire(String key, long expire) {
        Boolean flag = stringRedisTemplate.expire(key, expire, TimeUnit.SECONDS);
        return flag != null ? flag : false;
    }

    @Override
    public void remove(String key) {
        stringRedisTemplate.delete(key);
    }
}
