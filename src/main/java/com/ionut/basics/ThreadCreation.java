package com.ionut.basics;

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread started: " + Thread.currentThread().getName());
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread started: " + Thread.currentThread().getName());
    }
}

public class ThreadCreation {

    // Create a new thread using 'extends Thread'
    public Thread createThread() {
        Thread thread = new MyThread();
        thread.start();
        return thread;
    }

    // Create a new thread using 'implements Runnable'
    public Thread createThreadUsingRunnable() {
        Runnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();
        return thread;
    }

}
