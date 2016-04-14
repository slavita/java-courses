package Multithreading.Prorab;

public class Prorab implements Runnable {


    @Override
    public void run() {
        EX_Runnable A = new EX_Runnable("A____", 100);
        Thread threadA = new Thread(A);
        EX_Runnable B = new EX_Runnable("____B", 99);
        Thread threadB = new Thread(B);
        threadA.start();
        threadB.start();
        EX_Runnable C = new EX_Runnable("__C__" , 100);
        Thread threadC = new Thread(C);
        try {
            threadA.join();
            threadB.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        threadC.start();
    }
}
