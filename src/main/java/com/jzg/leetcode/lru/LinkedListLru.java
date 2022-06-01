package com.jzg.leetcode.lru;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Objects;

/**
 * 基于LinkedList实现LRU
 *
 * @author jinzg
 * @date 2021/2/10
 */
public class LinkedListLru<T> {

    private LinkedList<T> cache;
    private int capacity;

    public LinkedListLru(int capacity) {
        cache = new LinkedList<>();
        this.capacity = capacity;
    }

    public Object get(T target) {
        Iterator<T> iterator = cache.descendingIterator();
        while (iterator.hasNext()) {
            T t = iterator.next();
            if (Objects.equals(t, target)) {
                // 删除并添加到链表尾部
                iterator.remove();
                put(target);
                return t;
            }
        }
        return null;
    }

    public void put(T target) {
        Iterator<T> iterator = cache.descendingIterator();
        while (iterator.hasNext()) {
            T t = iterator.next();
            if (Objects.equals(t, target)) {
                // 删除
                iterator.remove();
            }
        }
        if (cache.size() == capacity) {
            // 删除链头
            cache.removeFirst();
        }
        // 添加到链表尾部
        cache.add(target);
    }

}
