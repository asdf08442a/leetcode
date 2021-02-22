package com.jzg.leetcode.other;

/**
 * 打印奇偶数
 *
 * @author jinzg
 * @date 2021/2/20
 */
public class PrintEvenOdd {

  public static void main(String[] args) {
    Wrapper wrapper = new Wrapper(1);
    PrintEven even = new PrintEven(wrapper);
    PrintOdd odd = new PrintOdd(wrapper);
    even.start();
    odd.start();
  }


  static class PrintEven extends Thread {

    Wrapper wrapper;

    PrintEven(Wrapper wrapper) {
      this.wrapper = wrapper;
    }

    @Override
    public void run() {
      synchronized (wrapper) {
        while (wrapper.getCount() <= 100) {
          if (wrapper.getCount() % 2 == 0) {
            System.out.println(wrapper.getCount());
            wrapper.setCount(wrapper.getCount() + 1);
            wrapper.notify();
          } else {
            try {
              wrapper.wait();
            } catch (InterruptedException e) {
              e.printStackTrace();
            }
          }
        }
      }
    }
  }

  static class PrintOdd extends Thread {

    Wrapper wrapper;

    PrintOdd(Wrapper wrapper) {
      this.wrapper = wrapper;
    }

    @Override
    public void run() {
      synchronized (wrapper) {
        while (wrapper.getCount() <= 100) {
          if (wrapper.getCount() % 2 == 1) {
            System.out.println(wrapper.getCount());
            wrapper.setCount(wrapper.getCount() + 1);
            wrapper.notify();
          } else {
            try {
              wrapper.wait();
            } catch (InterruptedException e) {
              e.printStackTrace();
            }
          }
        }
      }
    }
  }

  static class Wrapper {

    private Integer count;

    public Wrapper(Integer count) {
      this.count = count;
    }

    public Integer getCount() {
      return count;
    }

    public void setCount(Integer count) {
      this.count = count;
    }
  }
}
