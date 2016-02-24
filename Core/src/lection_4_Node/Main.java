package lection_4_Node;

import java.util.Arrays;

/**
 * Created by Сергей on 17.02.2016.
 */
public class Main {
    public static void main(String[] args) {
        Node tail1 = _(1, 2, 3);

        System.out.println(isGrowin(tail1, 0));
        //System.out.println(toStringIter(addLastRec(tail1,20)));


    }


    /**
     * Функция получает последовательность аргументов и делает односвязный список.
     * opyOfRange копирует часть массива аргументов.
     *
     * @param v аргументы.
     * @return
     */
    public static Node genRecFull(int... v) {
        if (v.length == 0)
            return null;
        else {
            int[] newArray = Arrays.copyOfRange(v, 1, v.length);
            return new Node(v[0], genRecFull(newArray));
        }

    }

    public static Node _(int... v) {
        return v.length == 0 ? null : new Node(v[0], genRecFull(Arrays.copyOfRange(v, 1, v.length)));
    }

    /**
     * печатает список.
     *
     * @param tail текущий елемент.
     * @return
     */
    public static String toStringIter(Node tail) {
        String result = "";
        while (tail != null) {
            result += tail.value + "->";
            tail = tail.next;
        }
        return result + "*";
    }

    public static String toStringRecFull(Node tail) {
        if (tail == null)
            return "*";
        else
            return tail.value + "->" + toStringRecFull(tail.next);
    }

    /**
     * слияние списков.
     *
     * @param tailA первый список.
     * @param tailB второй список.
     * @return
     */
    public static Node merge(Node tailA, Node tailB) {
        if (tailA != null && tailB != null) {
            if (tailA.value < tailB.value)
                return new Node(tailA.value, merge(tailA.next, tailB));
            else
                return new Node(tailB.value, merge(tailA, tailB.next));
        } else
            return (tailA == null) ? tailB : tailA;
    }

    public static Node copy(Node tail) {
        return tail == null ? null : new Node(tail.value, copy(tail.next));
    }

    /**
     * сравнивание списков.
     *
     * @param tailA первый список.
     * @param tailB второй список.
     * @return
     */
    public static boolean isEqual(Node tailA, Node tailB) {
        if (tailA != null && tailB != null) {
            return (tailA.value == tailB.value) && isEqual(tailA.next, tailB.next);
        } else
            return tailA == tailB;
    }

    /**
     * Добавляет элемент в конец текущего списка.
     * @param tailA
     * @param value
     * @return
     */
    public static Node addLastIter(Node tailA, int value) {
        Node tail = tailA;
        if (tailA == null) {
            tailA = new Node(value, null);
            tail = tailA;
        } else {
            while (true) {
                if (tailA.next != null) {
                    tailA = tailA.next;
                } else {
                    tailA.next = new Node(value, null);
                    break;
                }
            }

        }
        return tail;
    }

    /**
     * Добавляет элемент в конец нового списка.
     * @param tail
     * @param value
     * @return
     */
    public static Node addLastRec(Node tail, int value) {
        if(tail == null){
           return new Node(value, null);
        }
        else {
           return new Node(tail.value, addLastRec(tail.next, value));
        }
    }

    /**
     * Сумма.
     * @param tail
     * @return
     */
    public static int sum(Node tail) {
        return (tail == null) ? 0 : tail.value +sum(tail.next);
    }

    /**
     * Максимальный элемент.
     * @param tail
     * @return
     */
    public static int max(Node tail) {
        return (tail == null ) ? 0 : Math.max(tail.value, max(tail.next));
    }

    public static boolean isGrowin(Node tail, int value) {
        return (tail == null) || value < tail.value && isGrowin(tail.next, tail.value);
    }
}
