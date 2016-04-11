package Multithreading;

public class Consumer implements Runnable{
    private final int id;
    private final SingleElementBuffer buffer;

    public Consumer(int id, SingleElementBuffer buffer) {
        this.id = id;
        this.buffer = buffer;
    }


    @Override
    public void run() {
        while (true){
            try {
                Integer elem = buffer.get();
                System.out.println(elem + "consumed by " + id);
            } catch (InterruptedException e){
                System.out.println(Thread.currentThread().getName() + " stopped.");
                return;
            }

        }
    }
}
