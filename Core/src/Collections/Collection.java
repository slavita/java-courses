package Collections;

import java.util.*;

import static java.util.Arrays.*;


public class Collection {
    public static void main(String[] args) {

        /*
        CollectionTest test = new CollectionTest();

        ArrayList<Integer> array = new ArrayList<>();
        LinkedList<Integer> list = new LinkedList<>();
        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        long time1 = test.addTimeList(array);
        long time2 = test.addTimeList(list);
        long time3 = test.addTimeSet(hashSet);
        long time4 = test.addTimeSet(treeSet);

        System.out.println("Время добавления 1000000 элементов:");
        System.out.println("ArrayList  :  " + time1 + " ms");
        System.out.println("LinkedList :  " + time2 + " ms");
        System.out.println("HashSet    :  " + time3 + " ms");
        System.out.println("TreeSet    :  " + time4 + " ms");

        time1 = test.removeTimeList(array);
        time2 = test.removeTimeList(list);
        time3 = test.removeTimeSet(hashSet);
        time4 = test.removeTimeSet(treeSet);

        System.out.println("\nВремя удаления 100000 элементов:");
        System.out.println("ArrayList  :  " + time1 + " ms");
        System.out.println("LinkedList :  " + time2 + " ms");
        System.out.println("HashSet    :  " + time3 + " ms");
        System.out.println("TreeSet    :  " + time4 + " ms");

        time1 = test.searchTimeList(array);
        time2 = test.searchTimeList(list);
        time3 = test.searchTimeSet(hashSet);
        time4 = test.searchTimeSet(treeSet);

        System.out.println("\nВремя поиска 10000 элементов:");
        System.out.println("ArrayList  :  " + time1 + " ms");
        System.out.println("LinkedList :  " + time2 + " ms");
        System.out.println("HashSet    :  " + time3 + " ms");
        System.out.println("TreeSet    :  " + time4 + " ms");
        */

        List<String> list = new ArrayList<>(asList("DDD","BB","C"));
        //List<String> list1 = new ArrayList<>(new HashSet<>(list));

        for(int k = 0; k < list.size(); k++){
            System.out.println(list.get(k));
        }

        Iterator<String> iter = list.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }

        Map<String,String> map = new HashMap<>();
        map.put("A", "+");
        map.put("B", "*");
        map.put("C", "-");

        for(Map.Entry<String,String> elem : map.entrySet()){
            System.out.println(elem.getKey() + " -> " + elem.getValue());
        }
    }


}
