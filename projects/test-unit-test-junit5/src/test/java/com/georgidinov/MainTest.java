package com.georgidinov;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void getHw() {
        Main main = new Main();
        assertEquals("Hello World", main.getHw());
    }
}