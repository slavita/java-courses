package Multithreading.Prorab;


public class Tread_A_B_C {
    public static void main(String[] args) throws InterruptedException {

        Prorab prorab = new Prorab();
        Thread thread = new Thread(prorab);
        thread.start();

    }
}
