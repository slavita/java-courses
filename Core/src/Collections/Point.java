package Collections;

import java.util.*;

public class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Test {
    public static void main(String[] args) {
        Set<Point> set = new TreeSet<>();
        set.add(new Point(0, 10));
        set.add(new Point(10, 0));
        System.out.println(set);
    }
}


