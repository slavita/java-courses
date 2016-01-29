/**
 * Created by Cheater-PC on 29.01.2016.
 */
public class BunniesPrinter implements Runnable {

    static int k = 0;

    private static String spaces(int count){
        String result = "";
        for(int i = 0; i < count; i++ ) {
            result += " ";
        }
        return result;
    }


    @Override
    public void run() {

        System.out.println("Новый кролик раждён!");
        Runnable printer1 = new PrintRunnable(spaces(k++)+ k, 100);
        Thread thread1 = new Thread(printer1);
        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Thread(new BunniesPrinter()).start();
        new Thread(new BunniesPrinter()).start();



    }
}
