/**
 * Оба метода синхронизированы по this.
 */
public class SingleElementBuffer {
    private Integer elem = null;

    /**
     * ложит элемент в буффер.
     * если в буфере есть элемент,то поток пройдля через @synchronized засипает.
     * @param newElem новый элеметн.
     * @throws InterruptedException
     */
    public synchronized void put(Integer newElem) throws InterruptedException{
        while (elem != null){
            this.wait();
        }
        this.elem = newElem;
        this.notifyAll();
    }

    /**
     * забирает элемент из буффера.
     * если в буфере нет элемента,то поток пройдля через @synchronized засипает.
     * @return возвращает элемент из буффера.
     * @throws InterruptedException
     */
    public synchronized Integer get() throws InterruptedException{
        while (elem == null){
            this.wait();
        }
        int result = this.elem;
        this.elem = null;
        this.notifyAll();
        return result;
    }
}
