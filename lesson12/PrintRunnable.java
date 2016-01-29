
public class PrintRunnable implements Runnable{
    private String msg;
    private long sleepMillis;

    /**
     *
     * @param msg сообщение которое будет выводить поток.
     * @param sleepMillis время сна потока.
     */
    PrintRunnable(String msg,long sleepMillis){
        this.msg = msg;
        this.sleepMillis = sleepMillis;
    }

    /**
     * печатает 10 раз @param msg.
     */
    @Override
    public void run() {
        for (int k = 0; k < 10; k++){
            try {
                Thread.sleep(sleepMillis);
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
            System.out.println(msg);
        }

    }
}
