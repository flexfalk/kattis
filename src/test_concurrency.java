

public class test_concurrency {

    public static void main(String[] args) {

        IntCounter counter = new IntCounter();

        int n = 100000;

        Thread t1 = new Thread(() -> {
            for (int i=0; i<n; i++)
                counter.increment();
        });

        Thread t2 = new Thread(() -> {
            for (int i=0; i<n; i++)
                counter.increment();
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        }
        catch (InterruptedException exn) {
            System.out.print("Threads was interrupted");
        }

        System.out.println("Count is " + counter.get() + " and should be " + 2*n);

    }
}

class IntCounter {
    private int count = 0;

    public synchronized void increment() {
        //rel.lock();
        count = count + 1;
        //rel.unlock();
    }

    public long get() {
        return count;
    }
}