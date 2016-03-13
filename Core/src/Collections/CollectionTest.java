package Collections;

import java.util.*;

public class CollectionTest {

    public  static long addTimeList(List<Integer> list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }
        long end = System.currentTimeMillis()-start;
        return end;
    }


    public static long addTimeSet(Set<Integer> set) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            set.add(i);
        }
        long end = System.currentTimeMillis()-start;
        return end;
    }

    public static long removeTimeList(List<Integer> list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list.remove(i);
        }
        long end = System.currentTimeMillis()-start;
        return end;
    }

    public static long removeTimeSet(Set<Integer> set) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            set.remove(i);
        }
        long end = System.currentTimeMillis()-start;
        return end;
    }

    public static long searchTimeList(List<Integer> list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            list.contains(i);
        }
        long end = System.currentTimeMillis()-start;
        return end;
    }

    public  static long searchTimeSet(Set<Integer> set) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            set.contains(i);
        }
        long end = System.currentTimeMillis()-start;
        return end;
    }

}