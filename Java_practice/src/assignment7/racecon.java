package assignment7;

class Counter1 {
    int count = 0; 
    public synchronized void increment() {
        count++;
    }
}
class MyThread4 extends Thread {
    Counter1 counter;
    MyThread4(Counter1 counter) {
        this.counter = counter;
    }
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}
public class racecon {
    public static void main(String[] args) {
        Counter1 counter = new Counter1();
        MyThread4 t1 = new MyThread4(counter);
        MyThread4 t2 = new MyThread4(counter);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Final Counter Value: " + counter.count);
    }
}
  