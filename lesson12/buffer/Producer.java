/**
 * Created by Cheater-PC on 30.01.2016.
 */
public class Producer implements Runnable {
    private int startValue;
    private final int period;
    private final SingleElementBuffer buffer;

    /**
     * Конструктор.
     * @param startValue с какого числа начинать считать.
     * @param period сколько ждать.
     * @param buffer буффер.
     */
    public Producer(int startValue, int period, SingleElementBuffer buffer) {
        this.startValue = startValue;
        this.period = period;
        this.buffer = buffer;
    }

    /**
     * в безконечном цикле,печатает елемент который произведён.
     * ложит его в буффер и мпит период.
     */
    @Override
    public void run() {
        while(true){
            try {
                System.out.println(startValue + " produser");
                buffer.put(startValue++);
                Thread.sleep(period);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName());
            }
        }
    }
}
