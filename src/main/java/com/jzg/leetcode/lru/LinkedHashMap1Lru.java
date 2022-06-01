package com.jzg.leetcode.lru;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

/**
 * 基于LinkedHashMap实现LRU
 *
 * @author jinzg
 * @date 2021/2/10
 */
public class LinkedHashMap1Lru {

    private LinkedHashMap<Integer, Object> cache;
    private int capacity;

    public LinkedHashMap1Lru(int capacity) {
        this.capacity = capacity;
        cache = new LinkedHashMap(capacity, 0.75f, true) {
            @Override
            protected boolean removeEldestEntry(Entry eldest) {
                return size() > capacity;
            }
        };
    }

    public Object get(int key) {
        return cache.getOrDefault(key, null);
    }

    public void put(int key, Object value) {
        cache.put(key, value);
    }

}
