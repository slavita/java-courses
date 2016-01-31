
public class Main {
    public static void main(String[] args) {
        SingleElementBuffer buffer = new SingleElementBuffer();
        new Thread(new Producer(1, 100, buffer)).start();
        new Thread(new Consumer(buffer)).start();
    }
}
