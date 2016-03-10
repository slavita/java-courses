package Exceptions;


public class Main {
    public static void main(String[] args) throws Throwable {
        f();
    }

    static void f() throws Throwable {
        throw new Throwable();
    }
}
