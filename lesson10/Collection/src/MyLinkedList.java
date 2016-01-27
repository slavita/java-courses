

public class MyLinkedList extends MyNode {
    MyNode begin;
    MyNode end;


    void add(int x){
        MyNode temp = new MyNode();
        temp.x = x;

        if(begin != null){
            temp.pred = end;
            end.next = temp;
            end = temp;
        }else{
            temp.pred = null;
            begin = end = temp;
        }

    }

    void printListEnd(){
        MyNode temp = end;
        System.out.println("Вывод списка с конца:");
        while (temp != null){
            System.out.println(temp.x);
            temp = temp.pred;
        }
    }

    void printListBegin(){
        MyNode temp = begin;
        System.out.println("Вывод списка с начала:");
        while (temp != null){
            System.out.println(temp.x);
            temp = temp.next;
        }
    }

    void addBegin(int x){
        MyNode temp = new MyNode();
            temp.x = x;
            temp.pred = null;
            temp.next = begin;
            begin = temp;
    }

    void addEnd(int x){
        MyNode temp = new MyNode();
        temp.x = x;
        temp.pred = end;
        end.next = temp;
        end = temp;
    }

    void seach(int x){
        MyNode temp;
        temp = begin;
        while (temp != null) {
            if(temp.x == x )
            System.out.println("Искомый элемент : " + temp.x);
            temp = temp.next;
        }
    }
}
