package ru.lesson11.lesson_test;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import static org.junit.Assert.*;


public class UsersTest {

    /**
     * Возвращает true так как одинаковый класс и
     * @throws Exception
     */
    @Test
    public void testEquals() throws Exception {
        Users a = new Users(1,"first");
        Users b = new Users(2,"second");
        Users c = new Users(1,"first");
        assertEquals(true,a.equals(c));
    }

    @Test
    public void testHashcode() throws Exception {
        Users a = new Users(1,"first");
        Users b = new Users(2,"second");
        Users c = new Users(1,"first");
        System.out.println("a = "  + a.hashCode());
        System.out.println("b = "  + b.hashCode());
        System.out.println("c = "  + c.hashCode());
        assertEquals(true,a.hashCode()== c.hashCode());
    }

    @Test
    public void reflexive() throws Exception{
         Users a = new Users(1,"first");
         assertEquals(true,a.equals(a));
     }

    @Test
    public void symmetric() throws Exception{
        Users a = new Users(1,"first");
        Users b = new Users(1,"first");
        assertEquals(true,a.equals(b) && b.equals(a));
    }

    @Test
    public void transitive() throws Exception{
        Users a = new Users(1,"first");
        Users b = new Users(1,"first");
        Users c = new Users(1,"first");
        assertEquals(true,a.equals(b) && b.equals(c) && a.equals(c));
    }

    @Test
    public void consistent() throws Exception{
        Users a = new Users(1,"first");
        Users b = new Users(1,"first");
        for (int i = 0; i < 10;i++){
            assertEquals(true,a.equals(b));
        }
    }

    @Test
    public void testArrayListEquals() throws Exception{
        ArrayList<Users> users = new ArrayList<>();
        users.add(0,new Users(1,"first1"));
        users.add(1,new Users(2,"first2"));
        users.add(2,new Users(1,"first1"));
        assertEquals(users.get(0),users.get(2));
    }
    @Test
    public void testArrayListHashCode() throws Exception{
        ArrayList<Users> users = new ArrayList<>();
        users.add(0,new Users(1,"first1"));
        users.add(1,new Users(2,"first2"));
        users.add(2,new Users(1,"first1"));

        assertEquals(true,users.contains(new Users(1,"first1")));
    }

    @Test
    public void testHashSetEquals() throws Exception{
        HashSet<Users> users = new HashSet<>();
        users.add(new Users(1,"first1"));
        users.add(new Users(2,"first2"));
        users.add(new Users(1,"first1"));
        assertEquals(2,users.size());
    }
    @Test
    public void testHashMapEquals() throws Exception{
        HashMap<Integer,Users> users = new HashMap<>();
        users.put(0,new Users(1,"first1"));
        users.put(1,new Users(2,"first2"));
        users.put(2,new Users(1,"first1"));
        assertEquals(users.get(0),users.get(2));
    }

}