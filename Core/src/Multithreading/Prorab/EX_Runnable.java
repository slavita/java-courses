package Multithreading.Prorab;

class EX_Runnable implements Runnable{

    private String message;
    private long timeMillits;

    EX_Runnable(String message, long timeMillits) {
        this.message = message;
        this.timeMillits = timeMillits;
    }


    @Override
    public void run() {
        for(int i = 0; i < 5; i++) {
            System.out.println(message);
            try {
                Thread.sleep(timeMillits);
            } catch (InterruptedException e) {
                System.out.println("LOX");
                e.printStackTrace();
            }
        }
    }
}

