package Collections;


import java.util.*;

public class App_String_C {
    public static void main(String[] args) {
        NavigableSet<String> set = new TreeSet<>(new StrComparator());
        set.add("a");
        set.add("ay");
        set.add("b");
        set.add("ax");
        set.add("z");
        set.add("e");
        System.out.println(set);

        Iterator<String> iter = set.iterator();
        System.out.println(iter.next());
        System.out.println(iter.next());

        NavigableSet<String> subSet = set.subSet("b", true, "z", false);
        System.out.println(subSet);
    }

}


class StrComparator implements Comparator<String>{
    @Override
    public int compare(String str1, String str2) {
        int lenDiff = str1.length() - str2.length();
        if(lenDiff != 0){
            return lenDiff;
        } else {
            return str1.compareTo(str2);
        }
    }
}