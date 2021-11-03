package com;

import redis.clients.jedis.Jedis;

public class jedisDemo {
    public static void main(String[] args) {
        Jedis jedis=new Jedis("192.168.52.128",6379);

        String value = jedis.ping();
        System.out.println(value);

        jedis.close();
    }
}
