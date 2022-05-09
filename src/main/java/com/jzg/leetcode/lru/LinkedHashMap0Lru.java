package com.jzg.leetcode.lru;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

/**
 * 基于LinkedHashMap实现LRU
 *
 * @author jinzg
 * @date 2021/2/10
 */
public class LinkedHashMap0Lru {

  private LinkedHashMap<Integer, Object> cache;
  private int capacity;

  public LinkedHashMap0Lru(int capacity) {
    cache = new LinkedHashMap();
    this.capacity = capacity;
  }

  public Object get(int key) {
    if (cache.containsKey(key)) {
      Object val = cache.get(key);
      // 从链表中删除
      cache.remove(key);
      // 添加到链尾
      cache.put(key, val);
      return val;
    }
    return null;
  }

  public void put(int key, Object value) {
    if (cache.containsKey(key)) {
      // 从链表中删除
      cache.remove(key);
    }
    if (cache.size() == capacity) {
      Set<Integer> keySet = cache.keySet();
      Iterator<Integer> iterator = keySet.iterator();
      // 删除链头
      cache.remove(iterator.next());
    }
    // 添加到链尾
    cache.put(key, value);
  }

}
