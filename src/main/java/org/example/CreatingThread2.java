package org.example;

public class CreatingThread2 {
    public static void main(String[] args) {
        NewThread newThread = new NewThread();
        newThread.start();
    }

    private static class NewThread extends Thread {
        @Override
        public void run() {
            System.out.println("Hello from " + this.getName());
            System.out.println("My priority is " + this.getPriority());
        }
    }

}
