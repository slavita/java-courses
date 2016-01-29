/**
 * Created by Cheater-PC on 29.01.2016.
 * Класс надсмотрщик.Следит за поочерёдным выполнением потоков А,В,С.
 */

public class Supervisor implements Runnable {
    /**
     *Создаются два потока и после их смерти поток создаётсяя поток С.
     */
    @Override
    public void run() {
            try {
                for (int i = 0; i < 10; i++) {
                    Runnable printerA = new PrintRunnable(".   A", 100);
                    Thread threadA = new Thread(printerA);
                    threadA.start();
                    Runnable printerB = new PrintRunnable("B   .", 99);
                    Thread threadB = new Thread(printerB);
                    threadB.start();
                    threadA.join();
                    threadB.join();

                    System.out.println("-----");
                    Runnable printerC = new PrintRunnable("- C -", 100);
                    Thread threadC = new Thread(printerC);
                    threadC.start();
                    threadC.join();
                    System.out.println("-----");
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
    }
}
