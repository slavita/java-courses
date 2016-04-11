package Multithreading;

public class TestBuffer {
    public static void main(String[] args) throws InterruptedException{
        SingleElementBuffer buffer = new SingleElementBuffer();

        new Thread(new Produser(1, 300, buffer)).start();
        new Thread(new Produser(100, 500, buffer)).start();
        new Thread(new Produser(1000, 700, buffer)).start();

        new Thread(new Consumer(1, buffer)).start();
        new Thread(new Consumer(2, buffer)).start();
    }
}
