package Multithreading;

public class simplestop extends Thread {
    private volatile boolean running = true;

    public void run() {
        while (running) {
            System.out.println("Hello from thread");
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {}
        }
        System.out.println("Thread finished");
    }

    public void stopThread() {
        running = false;
    }

    public static void main(String[] args) throws InterruptedException {
        simplestop t = new simplestop();
        t.start();

        Thread.sleep(1000);  
        t.stopThread();      
    }
}