package com.georgidinov;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Junit5MainTest {

    @Test
    void getHw() {
        assertEquals("Hello World", new Main().getHw());
    }
}