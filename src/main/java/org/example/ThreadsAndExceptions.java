package org.example;

public class ThreadsAndExceptions {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                throw new RuntimeException("Intentional Exception");
            }
        });
        thread.setName("MISBIHAVING THREAD");
        thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("A critical error happened in thread " + t.getName() +
                        " the error is " + e.getMessage());
            }
        });

        thread.start();
        System.out.println("Hello I'm thread and my name is " + Thread.currentThread().getName());
    }
}
