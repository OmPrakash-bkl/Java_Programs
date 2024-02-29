class Counter {
    private int count = 1;
    synchronized void increment() {
        for(int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getId() + " Value " + i);
        }
    }
}
public class SynchronizationEx {
    public static void main(String[] args) {
        Counter counter = new Counter();

        Thread thread1 = new Thread(() -> counter.increment());
        Thread thread2 = new Thread(() -> counter.increment());

        thread1.start();
        thread2.start();
    }
}
