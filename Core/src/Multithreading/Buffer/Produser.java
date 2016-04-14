package Multithreading.Buffer;

public class Produser implements Runnable {
    private int startValue;
    private final int period;

    public Produser(int startValue, int period, SingleElementBuffer buffer) {
        this.period = period;
        this.buffer = buffer;
        this.startValue = startValue;
    }

    private final SingleElementBuffer buffer;




    @Override
    public void run() {
        while (true) {
            try {
                System.out.println(startValue + "produced");
                buffer.put(startValue++);
                Thread.sleep(period);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " stopped.");
                break;
            }
        }
    }
}
