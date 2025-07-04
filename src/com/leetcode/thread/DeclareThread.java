package com.leetcode.thread;

public class DeclareThread {

    private Integer number = 1;
    private Integer max = 10;
    public static void main(String[] args) {
      DeclareThread declareThread = new DeclareThread();

        Thread thread = new Thread(declareThread::odd);
        Thread thread1 = new Thread(declareThread::even);

        thread.start();
        thread1.start();

    }

    private synchronized void odd() {
        while (number <= max) {
            if (number % 2 == 1) {
                System.out.println("odd : "+number); // 1
                    number++;
                    notify();
            }else {
                try {
                   wait();
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }

        }

    }



    private synchronized  void even() {
        while (number <= max) {
            if (number % 2 == 0) {
                System.out.println("even : "+number); // 2
                number++;
                notify();

            }else {
                try {
                    wait();
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }

        }
    }
}
