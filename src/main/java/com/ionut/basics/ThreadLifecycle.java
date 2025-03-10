package com.ionut.basics;

public class ThreadLifecycle {

    public static void main(String[] args) throws InterruptedException {
        createThread();
    }

    public static Thread createThread() throws InterruptedException {
        Thread thread = new Thread(new SampleTask());

        // NEW: Thread is created but not started
        System.out.println("Thread state after creation: " + thread.getState());

        thread.start();

        // RUNNABLE: Thread is running or ready to run
        System.out.println("Thread state after start: " + thread.getState());

        Thread.sleep(100);
        // TIMED_WAITING: Thread is sleeping
        System.out.println("Thread state after sleep: " + thread.getState());

        Thread.sleep(100);
        // TERMINATED or RUNNABLE: Thread is running or ready to run
        System.out.println("Thread state before join: " + thread.getState());

        thread.join();

        // TERMINATED: Thread has completed execution
        System.out.println("Thread state after join: " + thread.getState());

        return thread;
    }

}

class SampleTask implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread started: " + Thread.currentThread().getName());
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();

            Thread.currentThread().interrupt();
        }
        System.out.println("Thread ended: " + Thread.currentThread().getName());
    }
}
