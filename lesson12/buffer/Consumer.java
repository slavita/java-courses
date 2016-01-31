/**
 * Created by Cheater-PC on 31.01.2016.
 */
public class Consumer implements Runnable {
    private final SingleElementBuffer buffer;

    /**
     * Конструктор.
     * @param buffer буффер.
     */
    public Consumer(SingleElementBuffer buffer) {
        this.buffer = buffer;
    }

    /**
     * Получает элемент из буффера.
     */
    @Override
    public void run() {
        while (true) {
            try {
                int elem = buffer.get();
                System.out.println(elem + " consumer");
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName());
                return;
            }
        }
    }
}
