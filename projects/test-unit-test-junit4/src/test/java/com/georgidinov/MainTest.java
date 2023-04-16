package com.georgidinov;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void getHw() {
        Main main = new Main();
        assertEquals("Hello World", main.getHw());
    }
}