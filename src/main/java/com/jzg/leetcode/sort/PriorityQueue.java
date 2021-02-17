package com.jzg.leetcode.sort;

import java.util.Arrays;

/**
 * 最小优先队列（基于最小二叉堆实现）
 *
 * @author jinzg
 * @date 2021/2/16
 */
public class PriorityQueue {

  private int[] array;
  private int size;

  public PriorityQueue() {
    array = new int[32];
  }

  /**
   * 入队
   */
  public void enQueue(int key) {
    if (size >= array.length) {
      resize();
    }
    array[size++] = key;
    upAdjust();
  }

  /**
   * 出队
   */
  public int deQueue() {
    if (size <= 0) {
      throw new RuntimeException("the queue is empty");
    }
    int head = array[0];
    array[0] = array[--size];
    downAdjust();
    return head;
  }

  private void upAdjust() {
    int childIndex = size - 1;
    int parentIndex = (childIndex - 1) / 2;
    int temp = array[childIndex];
    while (childIndex > 0 && temp < array[parentIndex]) {
      array[childIndex] = array[parentIndex];
      childIndex = parentIndex;
      parentIndex = (childIndex - 1) / 2;
    }
    array[childIndex] = temp;
  }

  private void downAdjust() {
    int parentIndex = 0;
    int temp = array[parentIndex];
    int childIndex = parentIndex * 2 + 1;
    while (childIndex < size) {
      if (childIndex + 1 < size && array[childIndex + 1] < array[childIndex]) {
        childIndex++;
      }
      if (temp < array[childIndex]) {
        break;
      }
      array[parentIndex] = array[childIndex];
      parentIndex = childIndex;
      childIndex = parentIndex * 2 + 1;
    }
    array[parentIndex] = temp;
  }

  private void resize() {
    int newSize = size * 2;
    array = Arrays.copyOf(array, newSize);
  }

  public static void main(String[] args) {
    PriorityQueue priorityQueue = new PriorityQueue();
    priorityQueue.enQueue(3);
    priorityQueue.enQueue(5);
    priorityQueue.enQueue(10);
    priorityQueue.enQueue(2);
    priorityQueue.enQueue(7);
    System.out.println(Arrays.toString(priorityQueue.array));
    System.out.println(priorityQueue.deQueue());
    System.out.println(Arrays.toString(priorityQueue.array));
    System.out.println(priorityQueue.deQueue());
    System.out.println(Arrays.toString(priorityQueue.array));
  }
}
