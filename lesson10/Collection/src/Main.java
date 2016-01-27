/**
 * Created by Cheater-PC on 27.01.2016.
 */
public class Main {
    public static void main(String[] arg) {
        MyLinkedList list = new MyLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.addBegin(0);
        list.addEnd(4);
        list.printListBegin();
        list.printListEnd();
        list.seach(3);
    }
}
