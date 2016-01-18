package ru.lesson7.lesson_test;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
import static ru.lesson7.lesson_test.Calculator.result;

public class ArgRunnerTest {

    @Test
    public void testSuma() throws Exception {
        ArgRunner argRunner = new ArgRunner();
        argRunner.suma(1,2);
        assertEquals(3, result);
    }

    @Test
    public void testSubtract() throws Exception {
        ArgRunner argRunner = new ArgRunner();
        argRunner.subtract(6,3);
        assertEquals(3, result);
    }

    @Test
    public void testMultiply() throws Exception {
        ArgRunner argRunner = new ArgRunner();
        argRunner.multiply(2,2);
        assertEquals(4, result);
    }

    @Test(expected = UserException.class)
    public void divException() throws UserException {
        ArgRunner argRunner = new ArgRunner();
        argRunner.divide();
    }


    @Test(expected = IllegalArgumentException.class)
    public void divRuntimeException() throws UserException {
        ArgRunner argRunner = new ArgRunner();
        argRunner.divide(1, 0);
    }
}