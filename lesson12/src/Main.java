
public class Main {
    public static void main(String[] args) throws InterruptedException {

        Runnable printer = new Supervisor();
        Thread thread = new Thread(printer);
        thread.start();

        }
    }





