package com.taotao.sso.dao;

public interface JedisClient {
	String get(String key);
	String set(String key,String value);
	String hget(String hkey,String key);
	Long hset(String hkey,String key,String value);
	long incr(String key);
	long decr(String key);
	long expire(String key,int second);
	long ttl(String key);
	Long del(String key);
	Long hdel(String hkey,String key);
}
