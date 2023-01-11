package org.example;

import static org.junit.Assert.*;

public class MainTest {

    @org.junit.Test
    public void sum() {
        Numbers numbers = new Numbers();
        int actual = numbers.sum(5);
        int expected = 15;
        assertEquals(expected, actual);
    }
}